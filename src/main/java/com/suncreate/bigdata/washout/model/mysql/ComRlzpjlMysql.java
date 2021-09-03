/**
 * @filename:ComDict 2021年7月13日
 * @project community-collect  V1.0
 * Copyright(c) 2020 suncreate Co. Ltd.
 * All right reserved.
 */
package com.suncreate.bigdata.washout.model.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_rlzpjl")
public class ComRlzpjlMysql {
    @Id
    private String id;
    private String appKey;
    private String snapNo;
    private String areaNo;
    private String snapTime;
    private String snapSmallImage;
    private String snapBigImage;
    private Date addTime;
}
