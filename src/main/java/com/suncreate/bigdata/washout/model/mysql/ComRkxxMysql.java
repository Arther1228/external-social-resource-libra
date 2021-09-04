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
@Table(name = "com_rkxx")
public class ComRkxxMysql {
    @Id
    private String id;
    private String appKey;
    private String xqbm;
    private String xm;
    private String xbdm;
    private String zjlxdm;
    private String zjhm;
    private String sjhm;
    private String ryZp;
    private String rklxdm;
    private String csrq;
    private String zzmmdm;
    private String yxqqsrq;
    private String yxqjzrq;
    private String zjzp;
    private String jgdm;
    private String zjdxz;
    private String hjdxz;
    private String gjdm;
    private String ywx;
    private String ywm;
    private String mzdm;
    private String zjxydm;
    private String  whcddm;
    private String hyzkdm;
    private String  byzkdm;
    private String bz;
    private Date addTime;
    private Date updateTime;

}