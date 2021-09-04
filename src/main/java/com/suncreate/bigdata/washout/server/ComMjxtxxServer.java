package com.suncreate.bigdata.washout.server;

import com.suncreate.bigdata.washout.model.libra.ComMjxtxxLibra;
import com.suncreate.bigdata.washout.model.mysql.ComMjxtxxMysql;
import com.suncreate.bigdata.washout.repository.libra.ComMjxtxxLibraRepository;
import com.suncreate.bigdata.washout.repository.mysql.ComMjxtxxMysqlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.List;

@Service
public class ComMjxtxxServer implements BaseServer<ComMjxtxxLibra, ComMjxtxxMysql> {

    @Autowired
    ComMjxtxxLibraRepository comMjxtxxLibraRepository;

    @Autowired
    ComMjxtxxMysqlRepository comZpjMysqlRepository;

    @Override
    public Timestamp findMaxTime() {
        return comMjxtxxLibraRepository.findMaxTime();
    }

    @Override
    public Page<ComMjxtxxMysql> findAll(Pageable pageable, Timestamp startTime) {
        return comZpjMysqlRepository.findAll(pageable, startTime);
    }

    @Override
    public void saveAll(List<ComMjxtxxLibra> targetList) {
        comMjxtxxLibraRepository.saveAll(targetList);
    }

}
