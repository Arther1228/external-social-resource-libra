package com.suncreate.bigdata.washout.server;

import com.suncreate.bigdata.washout.core.BaseServerInterface;
import com.suncreate.bigdata.washout.model.libra.ComXqLibra;
import com.suncreate.bigdata.washout.model.mysql.ComXqMysql;
import com.suncreate.bigdata.washout.repository.libra.ComXqLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComXqMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComXqServer implements BaseServerInterface<ComXqLibra, ComXqMysql> {

    @Autowired
    ComXqLibraRepository comXqLibraRepository;

    @Autowired
    ComXqMysqlRepository comXqMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comXqLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComXqMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comXqMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComXqLibra> targetList) {
        comXqLibraRepository.saveAll(targetList);
    }

}
