/**
 * @filename:ComDict 2021年7月13日
 * @project community-collect  V1.0
 * Copyright(c) 2020 suncreate Co. Ltd.
 * All right reserved.
 */
package com.suncreate.bigdata.washout.model.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "com_ldxx")
public class ComldxxMysql {
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

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Column(name = "appkey")
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    @Column(name = "xqbm")
    public String getXqbm() {
        return xqbm;
    }

    public void setXqbm(String xqbm) {
        this.xqbm = xqbm;
    }

    @Column(name = "ldbm")
    public String getLdbm() {
        return ldbm;
    }

    public void setLdbm(String ldbm) {
        this.ldbm = ldbm;
    }

    @Column(name = "ldh")
    public String getLdh() {
        return ldh;
    }

    public void setLdh(String ldh) {
        this.ldh = ldh;
    }

    @Column(name = "dys")
    public String getDys() {
        return dys;
    }

    public void setDys(String dys) {
        this.dys = dys;
    }

    @Column(name = "lcs")
    public String getLcs() {
        return lcs;
    }

    public void setLcs(String lcs) {
        this.lcs = lcs;
    }

    @Column(name = "jd")
    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    @Column(name = "wd")
    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    @Column(name = "hs")
    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    @Column(name = "addtime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}