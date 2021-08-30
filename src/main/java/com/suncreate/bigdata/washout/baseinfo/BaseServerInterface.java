package com.suncreate.bigdata.washout.baseinfo;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.sql.Timestamp;
import java.util.List;

public interface BaseServerInterface<T, S> {
    /**
     * 获取最新的数据时间
     *
     * @return
     */
    Timestamp findMaxTime();

    /**
     * 获取待更新数据
     *
     * @param pageable
     * @param startTime
     * @return
     */
    Page<S> findAll(Pageable pageable, Timestamp startTime);

    /**
     * 保存所有数据
     *
     * @param targetList
     */
    void saveAll(List<T> targetList);
}
