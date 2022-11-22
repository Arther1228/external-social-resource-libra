package com.suncreate.bigdata.washout.server;

import com.suncreate.bigdata.washout.model.libra.*;
import com.suncreate.bigdata.washout.model.mysql.*;
import com.suncreate.bigdata.washout.service.*;
import com.suncreate.bigdata.washout.utils.LogUtil;
import com.suncreate.logback.elasticsearch.metric.*;
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
import java.util.List;

@Service
public class SyncStaticDataServer {

    public static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    private static final Logger log = LoggerFactory.getLogger(SyncStaticDataServer.class);

    @Autowired
    ComDictServer comDictServer;

    @Autowired
    ComJzxxServer comJzxxServer;

    @Autowired
    ComXqServer comXqServer;

    @Autowired
    ComCldzxxServer comCldzxxServer;

    @Autowired
    ComRkxxServer comRkxxServer;

    @Autowired
    ComldxxServer comldxxServer;

    @Autowired
    ComClxxServer comClxxServer;

    @Autowired
    ComFwxxServer comFwxxServer;

    @Autowired
    ComZpjServer comZpjServer;

    @Autowired
    ComMjxtxxServer comMjxtxxServer;

    private boolean _lock = false;

    /**
     * 同步小区相关表
     */
    public void updateCommunityTables() {

        if (_lock) {
            log.info("processing ... skip");
            return;
        }
        _lock = true;
        log.info("-----同步小区表开始时间：" + dateFormat.format(new Date()) + "----------");

/*        syncTable(comRkxxServer, ComRkxxMysql.class, ComRkxxLibra.class, "人口信息表");
        syncTable(comXqServer, ComXqMysql.class, ComXqLibra.class, "小区表");
        syncTable(comDictServer, ComDictMysql.class, ComDictLibra.class, "数据字典表");
        syncTable(comJzxxServer, ComJzxxMysql.class, ComJzxxLibra.class, "建筑信息表");
        syncTable(comldxxServer, ComldxxMysql.class, ComldxxLibra.class, "楼栋信息表");
        syncTable(comClxxServer, ComClxxMysql.class, ComClxxLibra.class, "车辆信息表");
        syncTable(comFwxxServer, ComFwxxMysql.class, ComFwxxLibra.class, "房屋信息表");
        syncTable(comCldzxxServer, ComCldzxxMysql.class, ComCldzxxLibra.class, "车辆道闸表");
        syncTable(comZpjServer, ComZpjMysql.class, ComZpjLibra.class, "抓拍机表");*/
        syncTable(comMjxtxxServer, ComMjxtxxMysql.class, ComMjxtxxLibra.class, "门禁系统表");

        _lock = false;
        log.info("-----同步小区表结束时间：" + dateFormat.format(new Date()) + "----------");
    }

    /**
     * 根据addTime批量同步数据
     *
     * @param baseServer
     * @param mysqlClass
     * @param libraClass
     * @param tableName
     * @param <T>
     * @param <S>
     */
    public <T, S> void syncTable(BaseServer baseServer, Class<T> mysqlClass, Class<S> libraClass, String tableName) {

        // 从libra读取最新一条数据的时间戳
        Timestamp startTime = new Timestamp(0);
        try {
            Timestamp lastTime = baseServer.findMaxTime();
            if (lastTime != null) {
                startTime = lastTime;
            }
            LogUtil.log2ES_info("check", ProcStatus.suc.toString(), 1);
        } catch (Exception e) {
            log.error("get libra latest time fail. " + e.getMessage());
            LogUtil.log2ES_info("check", ProcStatus.fail.toString(), 1);
        }

        // 根据libra中最新时间戳从原始mysql分页取数据
        try {
            Page<T> mysqlPage = baseServer.findAll(PageRequest.of(0, 1000, Sort.by("addTime", "id")), startTime);
            log.info("table: " + tableName + " query from mysql by time " + startTime.toString() + " , got total page: " + mysqlPage.getTotalPages() + " , total element: " + mysqlPage.getTotalElements());

            List<S> targetList = new ArrayList<>();
            while (null != mysqlPage && mysqlPage.getSize() != 0) {
                List<T> originList = mysqlPage.getContent();
                targetList.clear();
                for (T origin : originList) {
                    S target = libraClass.newInstance();
                    // 从原始实体向目标实体copy数据
                    try {
                        BeanUtils.copyProperties(origin, target);
                    } catch (Exception ec) {
                        LogUtil.log2ES_info(ProcPhase.clear.toString(), ProcStatus.fail.toString(), 1);
                        log.error("table: " + tableName + " properties copy failed. pk=" + origin.toString() + " error: " + ec.getMessage());
                    }
                    // 暂存目标实体
                    targetList.add(target);
                }
                // 批量保存目标实体
                try {
                    baseServer.saveAll(targetList);
                    LogUtil.log2ES_info(ProcPhase.store.toString(), ProcStatus.suc.toString(), targetList.size());
                } catch (Exception ex) {
                    LogUtil.log2ES_info(ProcPhase.store.toString(), ProcStatus.fail.toString(), 1);
                    log.error("table: " + tableName + " save to libra failed. error: " + ex.getMessage());
                }
                mysqlPage = baseServer.findAll(mysqlPage.nextPageable(), startTime);
            }
        } catch (Exception ee) {
            LogUtil.log2ES_info(ProcPhase.collect.toString(), ProcStatus.fail.toString(), 1);
            log.error("table: " + tableName + " query mysql failed. error: " + ee.getMessage());
        }
    }


}
