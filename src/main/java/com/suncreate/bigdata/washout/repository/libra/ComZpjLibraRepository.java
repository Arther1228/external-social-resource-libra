package com.suncreate.bigdata.washout.repository.libra;

import com.suncreate.bigdata.washout.model.libra.ComZpjLibra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface ComZpjLibraRepository extends JpaRepository<ComZpjLibra, Long> {
    @Query(value = "select max(addTime) from com_zpj", nativeQuery = true)
    Timestamp findMaxTime();
}