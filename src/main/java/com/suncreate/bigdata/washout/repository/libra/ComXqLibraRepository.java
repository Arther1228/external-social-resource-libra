package com.suncreate.bigdata.washout.repository.libra;

import com.suncreate.bigdata.washout.model.libra.ComXqLibra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface ComXqLibraRepository extends JpaRepository<ComXqLibra, Long> {
    @Query(value = "select max(addTime) from com_xq", nativeQuery = true)
    Timestamp findMaxTime();
}