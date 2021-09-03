package com.suncreate.bigdata.washout.repository.mysql;

import com.suncreate.bigdata.washout.model.mysql.ComMjxtxxMysql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;

public interface ComMjxtxxMysqlRepository extends JpaRepository<ComMjxtxxMysql, Long> {
    @Query(value = "select z from ComMjxtxxMysql z where z.addTime >= :addTime")
    Page<ComMjxtxxMysql> findAll(Pageable pageable, @Param("addTime") Timestamp startTime);
}