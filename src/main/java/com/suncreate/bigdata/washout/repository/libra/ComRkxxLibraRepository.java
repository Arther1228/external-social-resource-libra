package com.suncreate.bigdata.washout.repository.libra;

import com.suncreate.bigdata.washout.model.libra.ComRkxxLibra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface ComRkxxLibraRepository extends JpaRepository<ComRkxxLibra, Long> {
    @Query(value = "select max(addTime) from com_rkxx", nativeQuery = true)
    Timestamp findMaxTime();
}