package com.suncreate.bigdata.washout.repository.mysql;

import com.suncreate.bigdata.washout.model.mysql.ComFwxxMysql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;

public interface ComFwxxMysqlRepository extends JpaRepository<ComFwxxMysql, Long> {
    @Query(value = "select z from ComFwxxMysql z where z.addTime >= :addTime")
    Page<ComFwxxMysql> findAll(Pageable pageable, @Param("addTime") Timestamp startTime);
}