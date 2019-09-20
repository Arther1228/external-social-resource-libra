package com.suncreate.bigdata.washout.service;

import com.google.gson.Gson;
import com.suncreate.bigdata.washout.model.libra.VJjzdWpJdcjbxxLibra;
import com.suncreate.bigdata.washout.model.oracle.VJjzdWpJdcjbxxOracle;
import com.suncreate.bigdata.washout.repository.libra.VJjzdWpJdcjbxxLibraRepository;
import com.suncreate.bigdata.washout.repository.oracle.VJjzdWpJdcjbxxOracleRepository;
import com.suncreate.logback.elasticsearch.metric.*;
import com.suncreate.logback.elasticsearch.util.MetricUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.LinkedBlockingQueue;

@Service
public class VmoOracle2LibraService {

    private static final Logger log = LoggerFactory.getLogger(VmoOracle2LibraService.class);

    @Autowired
    protected VJjzdWpJdcjbxxLibraRepository vJjzdWpJdcjbxxLibraRepository;

    @Autowired
    protected VJjzdWpJdcjbxxOracleRepository vJjzdWpJdcjbxxOracleRepository;

    private boolean _lock = false;

    private LinkedBlockingQueue<VJjzdWpJdcjbxxOracle> _sourcelist = new LinkedBlockingQueue<VJjzdWpJdcjbxxOracle>();

    public void start(boolean newturn) {
        if (_lock) {
            log.info("processing ... skip, now progress: " + _lastpage + "/" + _totalpage + " pages");
            return;
        }
        _lock = true;
        if (newturn) {
            resetcount();
        }
        readCarInfo();
        if (_lastpage == _totalpage && _totalpage != 0) {
            resetcount();
        }
        _lock = false;
    }

    private void resetcount() {
        _totalelement = 0;
        _lastpage = 0;
        _totalpage = 0;
        _saved = 0;
    }

    public void setPageSkip(int ps) {
        _lastpage = ps;
    }

    private long _totalelement = 0;
    private int _lastpage = 0;
    private int _totalpage = 0;
    private int _saved = 0;

    public void readCarInfo() {
        // 从车驾管oracle分页取数据
        try {
            Page<VJjzdWpJdcjbxxOracle> vJjzdWpJdcjbxxOraclePage = vJjzdWpJdcjbxxOracleRepository
                    .findAll(PageRequest.of(0, 1000));
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.suc.toString(), 0);
            _totalelement = vJjzdWpJdcjbxxOraclePage.getTotalElements();
            _totalpage = vJjzdWpJdcjbxxOraclePage.getTotalPages();
            log.info("readCarInfo query from oracle got total page: " + _totalpage + " , total element: "
                    + _totalelement);
            while (_lastpage < _totalpage - 1) {
                if (_lastpage > 0) {
                    Pageable page = vJjzdWpJdcjbxxOraclePage.getPageable();
                    while (_lastpage > page.getPageNumber()) {
                        page = page.next();
                    }
                    log.info("readCarInfo find last page: " + _lastpage + " , fast forwarding to: "
                            + page.getPageNumber());
                    vJjzdWpJdcjbxxOraclePage = vJjzdWpJdcjbxxOracleRepository.findAll(page);
                    _lastpage = vJjzdWpJdcjbxxOraclePage.getPageable().getPageNumber();
                }
                try {
                    while (null != vJjzdWpJdcjbxxOraclePage && vJjzdWpJdcjbxxOraclePage.getSize() != 0) {
                        log.info("readCarInfo page: " + vJjzdWpJdcjbxxOraclePage.getPageable().getPageNumber() + "/"
                                + vJjzdWpJdcjbxxOraclePage.getTotalPages());
                        List<VJjzdWpJdcjbxxOracle> originList = vJjzdWpJdcjbxxOraclePage.getContent();
                        log2ES_info(ProcPhase.collect.toString(), ProcStatus.suc.toString(), originList.size());
                        _sourcelist.addAll(originList);
                        // for (VJjzdWpJdcjbxxOracle origin : originList) {
                        // _sourcelist.put(origin);
                        // }
                        vJjzdWpJdcjbxxOraclePage = vJjzdWpJdcjbxxOracleRepository
                                .findAll(vJjzdWpJdcjbxxOraclePage.nextPageable());
                        _lastpage = vJjzdWpJdcjbxxOraclePage.getPageable().getPageNumber();
                    }
                } catch (Exception ew) {
                    log.error("readCarInfo repeat query oracle failed. error: ", ew);
                    log.info("readCarInfo failed at page: " + _lastpage + " , continue.");
                }
            }
            log.info("readCarInfo completed.");
        } catch (Exception ee) {
            log2ES_info(ProcPhase.collect.toString(), ProcStatus.fail.toString(), 1);
            log.error("readCarInfo query oracle for the first time failed. error: ", ee);
        }
    }

    public void saveCarInfo() {
        if (_sourcelist == null || _sourcelist.size() == 0) {
            // log.info("saveCarInfo queue is empty, skip.");
            return;
        }
        try {
            log.info("saveCarInfo start to save, total element: " + _totalelement);
            List<VJjzdWpJdcjbxxLibra> targetList = new ArrayList<>();
            int turncount = 0;
            int clearsuc = 0;
            int clearfail = 0;
            while (_sourcelist != null && _sourcelist.size() > 0) {
                VJjzdWpJdcjbxxOracle origin = _sourcelist.take();
                if (origin != null) {
                    VJjzdWpJdcjbxxLibra target = new VJjzdWpJdcjbxxLibra();
                    // 从原始实体向目标实体copy数据
                    try {
                        // objectid,hpzl,hphm,clpp1,clxh,clpp2,clsbdh,cllx,csys,syxz,sfzmhm,syr,gxrq,flag1
                        target.setObjectid(origin.getObjectid()); // ID
                        target.setHpzl(origin.getHpzl()); // 号牌种类
                        target.setHphm(origin.getHphm()); // 号牌号码
                        target.setClpp1(origin.getClpp1()); // 车辆品牌1
                        target.setClxh(origin.getClxh()); // 车辆型号
                        target.setClpp2(origin.getClpp2()); // 车辆品牌2
                        target.setClsbdh(origin.getClsbdh()); // 车辆识别代号
                        target.setCllx(origin.getCllx()); // 车辆类型
                        target.setCsys(origin.getCsys()); // 车身颜色
                        target.setSyxz(origin.getSyxz());
                        target.setSfzmhm(origin.getSfzmhm()); // 身份证明号码
                        target.setSyr(origin.getSyr()); // 所有人
                        target.setGxrq(origin.getGxrq()); // 更新日期
                        target.setFlag1(origin.getFlag1()); // 完整车牌号码
                        clearsuc++;
                        // 暂存目标实体
                        targetList.add(target);
                        turncount++;
                    } catch (Exception ec) {
                        clearfail++;
                        log.error("saveCarInfo properties copy failed. pk=" + origin.getObjectid() + " error: ", ec);
                    }
                }
                if (turncount >= 1000 || origin == null) {
                    if (clearsuc > 0)
                        log2ES_info(ProcPhase.clear.toString(), ProcStatus.suc.toString(), clearsuc);
                    if (clearfail > 0)
                        log2ES_info(ProcPhase.clear.toString(), ProcStatus.fail.toString(), clearfail);
                    // 批量保存目标实体
                    try {
                        vJjzdWpJdcjbxxLibraRepository.saveAll(targetList);
                        log2ES_info(ProcPhase.store.toString(), ProcStatus.suc.toString(), targetList.size());
                    } catch (Exception ex) {
                        log2ES_info(ProcPhase.store.toString(), ProcStatus.fail.toString(), 1);
                        log.error("saveCarInfo save to libra failed. error: ", ex);
                    }
                    _saved += targetList.size();
                    targetList.clear();
                    turncount = 0;
                    clearsuc = 0;
                    clearfail = 0;
                    log.info("saveCarInfo saved " + _saved + "/" + _totalelement);
                }
            }
            log.info("saveCarInfo completed.");
        } catch (Exception e) {
            log.error("saveCarInfo take from quere failed. error: ", e);
        }
    }

    private void log2ES_info(String procPhase, String procStatus, Integer count) {
        HashMap<String, Object> logMap;
        logMap = (HashMap<String, Object>) MetricUtil.getMap("External-Data", "vmo-info",
                DataType.struct_data.toString(), procPhase, procStatus, SourceType.oracle.toString(),
                SinkType.mpp.toString(), count);
        log.info(new Gson().toJson(logMap));
    }
}
