package com.suncreate.bigdata.washout.server;

import com.suncreate.bigdata.washout.model.libra.ComldxxLibra;
import com.suncreate.bigdata.washout.model.mysql.ComldxxMysql;
import com.suncreate.bigdata.washout.repository.libra.ComldxxLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComldxxMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComldxxServer implements BaseServer<ComldxxLibra, ComldxxMysql> {

    @Autowired
    ComldxxLibraRepository comldxxLibraRepository;

    @Autowired
    ComldxxMysqlRepository comldxxMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comldxxLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComldxxMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comldxxMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComldxxLibra> targetList) {
        comldxxLibraRepository.saveAll(targetList);
    }

}
