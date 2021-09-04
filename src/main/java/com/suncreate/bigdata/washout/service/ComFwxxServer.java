package com.suncreate.bigdata.washout.service;

import com.suncreate.bigdata.washout.model.libra.ComFwxxLibra;
import com.suncreate.bigdata.washout.model.mysql.ComFwxxMysql;
import com.suncreate.bigdata.washout.repository.libra.ComFwxxLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComFwxxMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComFwxxServer implements BaseServer<ComFwxxLibra, ComFwxxMysql> {

    @Autowired
    ComFwxxLibraRepository comFwxxLibraRepository;

    @Autowired
    ComFwxxMysqlRepository comFwxxMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comFwxxLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComFwxxMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comFwxxMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComFwxxLibra> targetList) {
        comFwxxLibraRepository.saveAll(targetList);
    }

}
