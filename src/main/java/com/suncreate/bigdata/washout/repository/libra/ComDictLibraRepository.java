package com.suncreate.bigdata.washout.repository.libra;

import com.suncreate.bigdata.washout.model.libra.ComDictLibra;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface ComDictLibraRepository extends JpaRepository<ComDictLibra, Long> {
    @Query(value = "select max(addTime) from com_dict", nativeQuery = true)
    Timestamp findMaxTime();
}