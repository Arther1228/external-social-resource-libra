package com.suncreate.bigdata.washout.repository.mysql;

import com.suncreate.bigdata.washout.model.mysql.ComCltxjlMysql;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.sql.Timestamp;

public interface ComCltxjlMysqlRepository extends JpaRepository<ComCltxjlMysql, Long> {
    @Query(value = "select z from ComCltxjlMysql z where z.addTime >= :addTime")
    Page<ComCltxjlMysql> findAll(Pageable pageable, @Param("addTime") Timestamp startTime);
}