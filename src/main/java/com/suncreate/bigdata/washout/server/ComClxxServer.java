package com.suncreate.bigdata.washout.server;

import com.suncreate.bigdata.washout.baseinfo.BaseServerInterface;
import com.suncreate.bigdata.washout.model.libra.ComClxxLibra;
import com.suncreate.bigdata.washout.model.mysql.ComClxxMysql;
import com.suncreate.bigdata.washout.repository.libra.ComClxxLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComClxxMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComClxxServer implements BaseServerInterface<ComClxxLibra, ComClxxMysql> {

    @Autowired
    ComClxxLibraRepository comClxxLibraRepository;

    @Autowired
    ComClxxMysqlRepository comClxxMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comClxxLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComClxxMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comClxxMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComClxxLibra> targetList) {
        comClxxLibraRepository.saveAll(targetList);
    }

}