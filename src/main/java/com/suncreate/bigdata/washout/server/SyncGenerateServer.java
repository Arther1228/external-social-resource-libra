package com.suncreate.bigdata.washout.server;

import com.suncreate.bigdata.washout.model.libra.ComOrgLibra;
import com.suncreate.bigdata.washout.model.mysql.ComXqMysql;
import com.suncreate.bigdata.washout.model.mysql.ComldxxMysql;
import com.suncreate.bigdata.washout.repository.libra.ComOrgLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComXqMysqlRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComldxxMysqlRepository;
import com.suncreate.bigdata.washout.utils.LogUtil;
import com.suncreate.logback.elasticsearch.metric.ProcPhase;
import com.suncreate.logback.elasticsearch.metric.ProcStatus;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class SyncGenerateServer {

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final Logger log = LoggerFactory.getLogger(SyncGenerateServer.class);

    @Autowired
    ComXqMysqlRepository comXqMysqlRepository;

    @Autowired
    ComOrgLibraRepository comOrgLibraRepository;

    @Autowired
    ComldxxMysqlRepository comldxxMysqlRepository;


    private boolean _lock = false;

    /**
     * 同步小区相关表
     */
    public void updateGenerateTables() {

        if (_lock) {
            log.info("processing ... skip");
            return;
        }
        _lock = true;
        log.info("-----动态生成同步表开始时间：" + dateFormat.format(new Date()) + "----------");

        syncComOrgTable();

        _lock = false;

        log.info("-----动态生成同步表结束时间：" + dateFormat.format(new Date()) + "----------");
    }


    /**
     * 构建小区结构表
     */
    public void syncComOrgTable() {

        //清空表数据
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
            log.info("query from mysql by time " + startTime.toString() + " , got total page: " + mysqlPage.getTotalPages() + " , total element: " + mysqlPage.getTotalElements());

            List<ComOrgLibra> targetList = new ArrayList<>();
            while (null != mysqlPage && mysqlPage.getSize() != 0) {
                List<ComXqMysql> originList = mysqlPage.getContent();
                targetList.clear();
                for (ComXqMysql origin : originList) {
                    //查询所有的房屋
                    if (StringUtils.isNotBlank(origin.getXqbm())) {
                        List<ComldxxMysql> ldxxList = comldxxMysqlRepository.findByXqbm(origin.getXqbm());
                        for (ComldxxMysql comldxxMysql : ldxxList) {
                            ComOrgLibra target = new ComOrgLibra();
                            target.setSsqxzqhdm(origin.getSsqXzqhdm());
                            target.setXqmc(origin.getXqmc());
                            target.setXqbm(origin.getXqbm());
                            target.setLdbm(comldxxMysql.getLdbm());
                            target.setLdh(comldxxMysql.getLdh());
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
                    LogUtil.log2ES_info(ProcPhase.store.toString(), ProcStatus.suc.toString(), targetList.size());
                } catch (Exception ex) {
                    LogUtil.log2ES_info(ProcPhase.store.toString(), ProcStatus.fail.toString(), 1);
                    log.error(" save to libra failed. error: " + ex.getMessage());
                }
                mysqlPage = comXqMysqlRepository.findAll(mysqlPage.nextPageable(), startTime);
            }
        } catch (Exception ee) {
            LogUtil.log2ES_info(ProcPhase.collect.toString(), ProcStatus.fail.toString(), 1);
            log.error(" query mysql failed. error: " + ee.getMessage());
        }
    }
}
