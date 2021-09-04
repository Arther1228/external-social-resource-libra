package com.suncreate.bigdata.washout.service;

import com.suncreate.bigdata.washout.model.libra.ComJzxxLibra;
import com.suncreate.bigdata.washout.model.mysql.ComJzxxMysql;
import com.suncreate.bigdata.washout.repository.libra.ComJzxxLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComJzxxMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComJzxxServer implements BaseServer<ComJzxxLibra, ComJzxxMysql> {

    @Autowired
    ComJzxxLibraRepository comJzxxLibraRepository;

    @Autowired
    ComJzxxMysqlRepository comJzxxMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comJzxxLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComJzxxMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comJzxxMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComJzxxLibra> targetList) {
        comJzxxLibraRepository.saveAll(targetList);
    }

}
