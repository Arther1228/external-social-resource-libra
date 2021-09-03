package com.suncreate.bigdata.washout.repository.mysql;

import com.suncreate.bigdata.washout.model.mysql.ComZpjMysql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;

public interface ComZpjMysqlRepository extends JpaRepository<ComZpjMysql, Long> {
    @Query(value = "select z from ComZpjMysql z where z.addTime >= :addTime")
    Page<ComZpjMysql> findAll(Pageable pageable, @Param("addTime") Timestamp startTime);
}