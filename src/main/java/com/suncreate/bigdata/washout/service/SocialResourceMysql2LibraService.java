package com.suncreate.bigdata.washout.service;

import com.google.gson.Gson;
import com.suncreate.bigdata.washout.model.libra.ComDictLibra;
import com.suncreate.bigdata.washout.model.libra.ComXqLibra;
import com.suncreate.bigdata.washout.model.mysql.ComDictMysql;
import com.suncreate.bigdata.washout.model.mysql.ComXqMysql;
import com.suncreate.bigdata.washout.repository.libra.ComDictLibraRepository;
import com.suncreate.bigdata.washout.repository.libra.ComXqLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComDictMysqlRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComXqMysqlRepository;
import com.suncreate.logback.elasticsearch.metric.*;
import com.suncreate.logback.elasticsearch.util.MetricUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class SocialResourceMysql2LibraService {

    @Autowired
    ComXqLibraRepository comXqLibraRepository;

    @Autowired
    ComXqMysqlRepository comXqMysqlRepository;

    @Autowired
    ComDictLibraRepository comDictLibraRepository;

    @Autowired
    ComDictMysqlRepository comDictMysqlRepository;

    private static final Logger log = LoggerFactory.getLogger(SocialResourceMysql2LibraService.class);

    /**
     * 同步小区静态数据
     */
    public void moveComXq() {
        Timestamp startTime = new Timestamp(0);
        // 从libra读取最新一条数据的时间戳
        try {
            Timestamp lastTime = comXqLibraRepository.findMaxTime();
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
            Page<ComXqMysql> comXqMysqlPage = comXqMysqlRepository.findAll(PageRequest.of(0, 1000, new Sort(Sort.Direction.ASC, "addTime", "id")), startTime);
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.suc.toString(), 0);
            log.info("query from mysql by time " + startTime.toString() + " , got total page: " + comXqMysqlPage.getTotalPages() + " , total element: " + comXqMysqlPage.getTotalElements());

            List<ComXqLibra> targetList = new ArrayList<>();
            while (null != comXqMysqlPage && comXqMysqlPage.getSize() != 0) {
                log.info("ComXq page: " + comXqMysqlPage.getPageable().getPageNumber() + "/" + comXqMysqlPage.getTotalPages());
                List<ComXqMysql> originList = comXqMysqlPage.getContent();
                log2ES_info(ProcPhase.collect.toString(), ProcStatus.suc.toString(), originList.size());
                targetList.clear();
                for (ComXqMysql origin : originList) {
                    ComXqLibra target = new ComXqLibra();
                    // 从原始实体向目标实体copy数据
                    try {
                        BeanUtils.copyProperties(origin, target);
                        log2ES_info(ProcPhase.clear.toString(), ProcStatus.suc.toString(), 1);
                    } catch (Exception ec) {
                        log2ES_info(ProcPhase.clear.toString(), ProcStatus.fail.toString(), 1);
                        log.error("ComXq properties copy failed. pk=" + origin.getId() + " error: " + ec.getMessage());
                    }
                    // 暂存目标实体
                    targetList.add(target);
                }
                // 批量保存目标实体
                try {
                    comXqLibraRepository.saveAll(targetList);
                    log2ES_info(ProcPhase.store.toString(), ProcStatus.suc.toString(), targetList.size());
                } catch (Exception ex) {
                    log2ES_info(ProcPhase.store.toString(), ProcStatus.fail.toString(), 1);
                    log.error("ComXq save to libra failed. error: " + ex.getMessage());
                }
                comXqMysqlPage = comXqMysqlRepository.findAll(comXqMysqlPage.nextPageable(), startTime);
            }
        } catch (Exception ee) {
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.fail.toString(), 1);
            log.error("ComXq query mysql failed. error: " + ee.getMessage());
        }
    }


    /**
     * 同步数据字典静态数据
     */
    public void moveComDict() {
        Timestamp startTime = new Timestamp(0);
        // 从libra读取最新一条数据的时间戳
        try {
            Timestamp lastTime = comDictLibraRepository.findMaxTime();
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
            Page<ComDictMysql> comDictMysqlPage = comDictMysqlRepository.findAll(PageRequest.of(0, 1000, new Sort(Sort.Direction.ASC, "addTime", "id")), startTime);
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.suc.toString(), 0);
            log.info("query from mysql by time " + startTime.toString() + " , got total page: " + comDictMysqlPage.getTotalPages() + " , total element: " + comDictMysqlPage.getTotalElements());

            List<ComDictLibra> targetList = new ArrayList<>();
            while (null != comDictMysqlPage && comDictMysqlPage.getSize() != 0) {
                log.info("ComXq page: " + comDictMysqlPage.getPageable().getPageNumber() + "/" + comDictMysqlPage.getTotalPages());
                List<ComDictMysql> originList = comDictMysqlPage.getContent();
                log2ES_info(ProcPhase.collect.toString(), ProcStatus.suc.toString(), originList.size());
                targetList.clear();
                for (ComDictMysql origin : originList) {
                    ComDictLibra target = new ComDictLibra();
                    // 从原始实体向目标实体copy数据
                    try {
                        BeanUtils.copyProperties(origin, target);
                        log2ES_info(ProcPhase.clear.toString(), ProcStatus.suc.toString(), 1);
                    } catch (Exception ec) {
                        log2ES_info(ProcPhase.clear.toString(), ProcStatus.fail.toString(), 1);
                        log.error("ComXq properties copy failed. pk=" + origin.getId() + " error: " + ec.getMessage());
                    }
                    // 暂存目标实体
                    targetList.add(target);
                }
                // 批量保存目标实体
                try {
                    comDictLibraRepository.saveAll(targetList);
                    log2ES_info(ProcPhase.store.toString(), ProcStatus.suc.toString(), targetList.size());
                } catch (Exception ex) {
                    log2ES_info(ProcPhase.store.toString(), ProcStatus.fail.toString(), 1);
                    log.error("ComXq save to libra failed. error: " + ex.getMessage());
                }
                comDictMysqlPage = comDictMysqlRepository.findAll(comDictMysqlPage.nextPageable(), startTime);
            }
        } catch (Exception ee) {
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.fail.toString(), 1);
            log.error("ComXq query mysql failed. error: " + ee.getMessage());
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
