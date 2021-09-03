package com.suncreate.bigdata.washout.server;

import com.suncreate.bigdata.washout.baseinfo.BaseServerInterface;
import com.suncreate.bigdata.washout.model.libra.ComZpjLibra;
import com.suncreate.bigdata.washout.model.mysql.ComZpjMysql;
import com.suncreate.bigdata.washout.repository.libra.ComZpjLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComZpjMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComZpjServer implements BaseServerInterface<ComZpjLibra, ComZpjMysql> {

    @Autowired
    ComZpjLibraRepository comZpjLibraRepository;

    @Autowired
    ComZpjMysqlRepository comZpjMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comZpjLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComZpjMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comZpjMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComZpjLibra> targetList) {
        comZpjLibraRepository.saveAll(targetList);
    }

}
