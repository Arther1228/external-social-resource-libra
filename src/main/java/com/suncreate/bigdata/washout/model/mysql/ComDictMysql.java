/**
 * @filename:ComDict 2021年7月13日
 * @project community-collect  V1.0
 * Copyright(c) 2020 suncreate Co. Ltd.
 * All right reserved.
 */
package com.suncreate.bigdata.washout.model.mysql;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "com_dict")
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ComDictMysql {
    @Id
    private String id;
    private String dictCode;
    private String dictClass;
    private String dictTypeName;
    private String dictTypeValue;
    private String dictSource;
    private String project;
    private Date addTime;

}
