package com.suncreate.bigdata.washout.service;

import com.suncreate.bigdata.washout.model.libra.ComDictLibra;
import com.suncreate.bigdata.washout.model.mysql.ComDictMysql;
import com.suncreate.bigdata.washout.repository.libra.ComDictLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComDictMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComDictServer implements BaseServer<ComDictLibra, ComDictMysql> {

    @Autowired
    ComDictLibraRepository comDictLibraRepository;

    @Autowired
    ComDictMysqlRepository comDictMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comDictLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComDictMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comDictMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComDictLibra> targetList) {
        comDictLibraRepository.saveAll(targetList);
    }

}
