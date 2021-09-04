package com.suncreate.bigdata.washout.service;

import com.suncreate.bigdata.washout.model.libra.ComCldzxxLibra;
import com.suncreate.bigdata.washout.model.mysql.ComCldzxxMysql;
import com.suncreate.bigdata.washout.repository.libra.ComCldzxxLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComCldzxxMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComCldzxxServer implements BaseServer<ComCldzxxLibra, ComCldzxxMysql> {

    @Autowired
    ComCldzxxLibraRepository comCldzxxLibraRepository;

    @Autowired
    ComCldzxxMysqlRepository comCldzxxMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comCldzxxLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComCldzxxMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comCldzxxMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComCldzxxLibra> targetList) {
        comCldzxxLibraRepository.saveAll(targetList);
    }

}
