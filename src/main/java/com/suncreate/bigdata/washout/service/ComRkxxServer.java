package com.suncreate.bigdata.washout.service;

import com.suncreate.bigdata.washout.model.libra.ComRkxxLibra;
import com.suncreate.bigdata.washout.model.mysql.ComRkxxMysql;
import com.suncreate.bigdata.washout.repository.libra.ComRkxxLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComRkxxMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComRkxxServer implements BaseServer<ComRkxxLibra, ComRkxxMysql> {

    @Autowired
    ComRkxxLibraRepository comRkxxLibraRepository;

    @Autowired
    ComRkxxMysqlRepository comRkxxMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comRkxxLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComRkxxMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comRkxxMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComRkxxLibra> targetList) {
        comRkxxLibraRepository.saveAll(targetList);
    }

}
