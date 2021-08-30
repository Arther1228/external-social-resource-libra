package com.suncreate.bigdata.washout.repository.mysql;

import com.suncreate.bigdata.washout.model.mysql.ComJzxxMysql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;

public interface ComJzxxMysqlRepository extends JpaRepository<ComJzxxMysql, Long> {
    @Query(value = "select z from ComJzxxMysql z where z.addTime >= :addTime")
    Page<ComJzxxMysql> findAll(Pageable pageable, @Param("addTime") Timestamp startTime);
}