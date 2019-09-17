package com.suncreate.bigdata.washout.repository.oracle;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.suncreate.bigdata.washout.model.oracle.VJjzdWpJdcjbxxOracle;

public interface VJjzdWpJdcjbxxOracleRepository extends JpaRepository<VJjzdWpJdcjbxxOracle, Long> {
    @Query(value = "select z from VJjzdWpJdcjbxxOracle z")
    Page<VJjzdWpJdcjbxxOracle> findAll(Pageable pageable);
}