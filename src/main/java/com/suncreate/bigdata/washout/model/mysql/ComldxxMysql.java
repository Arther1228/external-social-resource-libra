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
@Table(name = "com_ldxx")
public class ComldxxMysql {
    @Id
    private String id;
    private String appKey;
    private String xqbm;
    private String ldbm;
    private String ldh;
    private String dys;
    private String lcs;
    private String jd;
    private String wd;
    private String hs;
    private Date addTime;
    private Date updateTime;

}