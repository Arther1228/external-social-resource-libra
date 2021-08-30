package com.suncreate.bigdata.washout.service;

import com.google.gson.Gson;
import com.suncreate.bigdata.washout.baseinfo.BaseServerInterface;
import com.suncreate.bigdata.washout.model.libra.ComDictLibra;
import com.suncreate.bigdata.washout.model.libra.ComJzxxLibra;
import com.suncreate.bigdata.washout.model.libra.ComOrgLibra;
import com.suncreate.bigdata.washout.model.libra.ComXqLibra;
import com.suncreate.bigdata.washout.model.mysql.ComDictMysql;
import com.suncreate.bigdata.washout.model.mysql.ComFwxxMysql;
import com.suncreate.bigdata.washout.model.mysql.ComJzxxMysql;
import com.suncreate.bigdata.washout.model.mysql.ComXqMysql;
import com.suncreate.bigdata.washout.repository.libra.ComOrgLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComFwxxMysqlRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComXqMysqlRepository;
import com.suncreate.bigdata.washout.server.ComDictServer;
import com.suncreate.bigdata.washout.server.ComJzxxServer;
import com.suncreate.bigdata.washout.server.ComXqServer;
import com.suncreate.logback.elasticsearch.metric.*;
import com.suncreate.logback.elasticsearch.util.MetricUtil;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
public class SocialResourceMysql2LibraService {

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final Logger log = LoggerFactory.getLogger(SocialResourceMysql2LibraService.class);

    @Autowired
    ComDictServer comDictServer;

    @Autowired
    ComJzxxServer comJzxxServer;

    @Autowired
    ComXqServer comXqServer;

    @Autowired
    ComXqMysqlRepository comXqMysqlRepository;

    @Autowired
    ComOrgLibraRepository comOrgLibraRepository;

    @Autowired
    ComFwxxMysqlRepository comFwxxMysqlRepository;

    /**
     * 同步小区相关表
     */
    public void updateCommunityTables() {
        System.out.println("-------------------------同步小区表开始时间：" + dateFormat.format(new Date()) + "-------------------------");

        syncTable(comXqServer, ComXqMysql.class, ComXqLibra.class, "智慧社区表");
        //syncTable(comDictServer, ComDictMysql.class, ComDictLibra.class, "数据字典表");
        //syncTable(comJzxxServer, ComJzxxMysql.class, ComJzxxLibra.class, "建筑信息表");

        //syncComOrgTable();
    }

    /**
     * 根据addTime批量同步数据
     *
     * @param baseServer
     * @param mysqlClass
     * @param libraClass
     * @param name
     * @param <T>
     * @param <S>
     */
    public <T, S> void syncTable(BaseServerInterface baseServer, Class<T> mysqlClass, Class<S> libraClass, String name) {
        // 从libra读取最新一条数据的时间戳
        Timestamp startTime = new Timestamp(0);
        try {
            Timestamp lastTime = baseServer.findMaxTime();
            if (lastTime != null) {
                startTime = lastTime;
            }
            log2ES_info("check", ProcStatus.suc.toString(), 1);
        } catch (Exception e) {
            log.error("get libra latest time fail. " + e.getMessage());
            log2ES_info("check", ProcStatus.fail.toString(), 1);
        }

        // 根据libra中最新时间戳从原始mysql分页取数据
        try {
            Page<T> mysqlPage = baseServer.findAll(PageRequest.of(0, 1000, new Sort(Sort.Direction.ASC, "addTime", "id")), startTime);
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.suc.toString(), 0);
            log.info("table: " + name + " query from mysql by time " + startTime.toString() + " , got total page: " + mysqlPage.getTotalPages() + " , total element: " + mysqlPage.getTotalElements());

            List<S> targetList = new ArrayList<>();
            while (null != mysqlPage && mysqlPage.getSize() != 0) {
                List<T> originList = mysqlPage.getContent();
                targetList.clear();
                for (T origin : originList) {
                    S target = libraClass.newInstance();
                    // 从原始实体向目标实体copy数据
                    try {
                        BeanUtils.copyProperties(origin, target);
                        log2ES_info(ProcPhase.clear.toString(), ProcStatus.suc.toString(), 1);
                    } catch (Exception ec) {
                        log2ES_info(ProcPhase.clear.toString(), ProcStatus.fail.toString(), 1);
                        log.error("table: " + name + " properties copy failed. pk=" + origin.toString() + " error: " + ec.getMessage());
                    }
                    // 暂存目标实体
                    targetList.add(target);
                }
                // 批量保存目标实体
                try {
                    baseServer.saveAll(targetList);
                    log2ES_info(ProcPhase.store.toString(), ProcStatus.suc.toString(), targetList.size());
                } catch (Exception ex) {
                    log2ES_info(ProcPhase.store.toString(), ProcStatus.fail.toString(), 1);
                    log.error("table: " + name + " save to libra failed. error: " + ex.getMessage());
                }
                mysqlPage = baseServer.findAll(mysqlPage.nextPageable(), startTime);
            }
        } catch (Exception ee) {
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.fail.toString(), 1);
            log.error("table: " + name + " query mysql failed. error: " + ee.getMessage());
        }
    }


    /**
     * 构建小区结构表
     */
    public void syncComOrgTable() {

        //清空com_org表数据
        try {
            comOrgLibraRepository.deleteAllInBatch();
        } catch (Exception e) {
            log.info("reset table com_org fail, message: " + e.getMessage());
        }

        // 从libra读取最新一条数据的时间戳
        Timestamp startTime = new Timestamp(0);
        // 根据libra中最新时间戳从原始mysql分页取数据
        try {
            Page<ComXqMysql> mysqlPage = comXqMysqlRepository.findAll(PageRequest.of(0, 1, new Sort(Sort.Direction.ASC, "addTime", "id")), startTime);
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.suc.toString(), 0);
            log.info("query from mysql by time " + startTime.toString() + " , got total page: " + mysqlPage.getTotalPages() + " , total element: " + mysqlPage.getTotalElements());

            List<ComOrgLibra> targetList = new ArrayList<>();
            while (null != mysqlPage && mysqlPage.getSize() != 0) {
                List<ComXqMysql> originList = mysqlPage.getContent();
                targetList.clear();
                for (ComXqMysql origin : originList) {
                    //查询所有的房屋
                    if (StringUtils.isNotBlank(origin.getXqbm())) {
                        List<ComFwxxMysql> fwList = comFwxxMysqlRepository.findByXqbm(origin.getXqbm());
                        for (ComFwxxMysql comFwxxMysql : fwList) {
                            ComOrgLibra target = new ComOrgLibra();
                            target.setSsqxzqhdm(origin.getSsqXzqhdm());
                            target.setXqbm(origin.getXqbm());
                            target.setLdbm(comFwxxMysql.getLdbm());
                            target.setFwbm(comFwxxMysql.getFwbm());
                            // 暂存目标实体
                            targetList.add(target);
                        }
                    } else {
                        log.error("xqbm is empty, relate fwxx can't get.");
                    }
                }
                // 批量保存目标实体
                try {
                    comOrgLibraRepository.saveAll(targetList);
                    log2ES_info(ProcPhase.store.toString(), ProcStatus.suc.toString(), targetList.size());
                } catch (Exception ex) {
                    log2ES_info(ProcPhase.store.toString(), ProcStatus.fail.toString(), 1);
                    log.error(" save to libra failed. error: " + ex.getMessage());
                }
                mysqlPage = comXqMysqlRepository.findAll(mysqlPage.nextPageable(), startTime);
            }
        } catch (Exception ee) {
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.fail.toString(), 1);
            log.error(" query mysql failed. error: " + ee.getMessage());
        }
    }


    private void log2ES_info(String procPhase, String procStatus, Integer count) {
        HashMap<String, Object> logMap;
        logMap = (HashMap<String, Object>) MetricUtil.getMap("External-Data", "social-resource-info",
                DataType.struct_data.toString(), procPhase, procStatus, SourceType.mysql.toString(),
                SinkType.mpp.toString(), count);
        log.info(new Gson().toJson(logMap));
    }
}
