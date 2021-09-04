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
@Table(name = "com_fwxx")
public class ComFwxxMysql {
    @Id
    private String id;
    private String appKey;
    private String xqbm;
    private String ldbm;
    private String fwbm;
    private String dyh;
    private String mph;
    private String fwztdm;
    private String lch;
    private String fwytdm;
    private String cqxzdm;
    private String fwmj;
    private String bz;
    private Date addTime;
    private Date updateTime;

}