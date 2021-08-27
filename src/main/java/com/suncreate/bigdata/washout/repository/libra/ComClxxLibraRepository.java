package com.suncreate.bigdata.washout.repository.libra;

import com.suncreate.bigdata.washout.model.libra.ComClxxLibra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface ComClxxLibraRepository extends JpaRepository<ComClxxLibra, Long> {
    @Query(value = "select max(addTime) from com_clxx", nativeQuery = true)
    Timestamp findMaxTime();
}