package com.suncreate.bigdata.washout.repository.libra;

import com.suncreate.bigdata.washout.model.libra.ComldxxLibra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.sql.Timestamp;

public interface ComldxxLibraRepository extends JpaRepository<ComldxxLibra, Long> {
    @Query(value = "select max(addTime) from com_ldxx", nativeQuery = true)
    Timestamp findMaxTime();
}