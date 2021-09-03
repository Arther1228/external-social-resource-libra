package com.suncreate.bigdata.washout.service;

import com.google.gson.Gson;
import com.suncreate.bigdata.washout.repository.mysql.ComRytxjlMysqlRepository;
import com.suncreate.logback.elasticsearch.metric.DataType;
import com.suncreate.logback.elasticsearch.metric.SinkType;
import com.suncreate.logback.elasticsearch.metric.SourceType;
import com.suncreate.logback.elasticsearch.util.MetricUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;

@Service
public class SyncDynamicDataService {

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final Logger log = LoggerFactory.getLogger(SyncDynamicDataService.class);

    private boolean _lock = false;

    @Autowired
    ComRytxjlMysqlRepository comRytxjlMysqlRepository;

    /**
     * 同步小区相关表
     */
    public void updateCommunityTablesToES() {

        if (_lock) {
            log.info("processing ... skip");
            return;
        }
        _lock = true;
        log.info("-----同步小区动态表开始时间：" + dateFormat.format(new Date()) + "----------");

        syncTableToES(comRytxjlMysqlRepository);

        _lock = false;

        log.info("-----同步小区动态表结束时间：" + dateFormat.format(new Date()) + "----------");
    }

    /**
     *
     * @param jpaRepository
     */
    public void syncTableToES(JpaRepository jpaRepository) {

        //查询表中最新一条数据的时间

    }


    private void log2ES_info(String procPhase, String procStatus, Integer count) {
        HashMap<String, Object> logMap;
        logMap = (HashMap<String, Object>) MetricUtil.getMap("External-Data", "social-resource-info",
                DataType.struct_data.toString(), procPhase, procStatus, SourceType.mysql.toString(),
                SinkType.mpp.toString(), count);
        log.info(new Gson().toJson(logMap));
    }
}
