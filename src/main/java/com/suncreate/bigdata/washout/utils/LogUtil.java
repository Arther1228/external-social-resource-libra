package com.suncreate.bigdata.washout.utils;

import com.google.gson.Gson;
import com.suncreate.logback.elasticsearch.metric.DataType;
import com.suncreate.logback.elasticsearch.metric.SinkType;
import com.suncreate.logback.elasticsearch.metric.SourceType;
import com.suncreate.logback.elasticsearch.util.MetricUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

public class LogUtil {

    private static final Logger log = LoggerFactory.getLogger(LogUtil.class);

    public static void log2ES_info(String procPhase, String procStatus, Integer count) {
        HashMap<String, Object> logMap;
        logMap = (HashMap<String, Object>) MetricUtil.getMap("External-Data", "social-resource-info",
                DataType.struct_data.toString(), procPhase, procStatus, SourceType.mysql.toString(),
                SinkType.mpp.toString(), count);
        log.info(new Gson().toJson(logMap));
    }
}
