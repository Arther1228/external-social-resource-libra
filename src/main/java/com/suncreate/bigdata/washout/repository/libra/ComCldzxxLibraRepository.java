package com.suncreate.bigdata.washout.repository.libra;

import com.suncreate.bigdata.washout.model.libra.ComCldzxxLibra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface ComCldzxxLibraRepository extends JpaRepository<ComCldzxxLibra, Long> {
    @Query(value = "select max(addTime) from com_cldzxx", nativeQuery = true)
    Timestamp findMaxTime();
}