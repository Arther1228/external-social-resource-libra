package com.suncreate.bigdata.washout.repository.mysql;

import com.suncreate.bigdata.washout.model.mysql.ComXqMysql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;

public interface ComXqMysqlRepository extends JpaRepository<ComXqMysql, Long> {
    @Query(value = "select z from ComXqMysql z where z.addTime >= :addTime")
    Page<ComXqMysql> findAll(Pageable pageable, @Param("addTime") Timestamp startTime);
}