package com.suncreate.bigdata.washout.repository.libra;

import com.suncreate.bigdata.washout.model.libra.ComMjxtxxLibra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface ComMjxtxxLibraRepository extends JpaRepository<ComMjxtxxLibra, Long> {
    @Query(value = "select max(addTime) from com_mjxtxx", nativeQuery = true)
    Timestamp findMaxTime();
}