package com.suncreate.bigdata.washout.model.libra;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "com_ldxx", schema = "vision_if", catalog = "shiny")
public class ComldxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String xqbm;
    private String ldbm;
    private String ldh;
    private String dys;
    private String lcs;
    private String jd;
    private String wd;
    private String hs;
    @Column(name = "addtime")
    private Date addTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getXqbm() {
        return xqbm;
    }

    public void setXqbm(String xqbm) {
        this.xqbm = xqbm;
    }

    public String getLdbm() {
        return ldbm;
    }

    public void setLdbm(String ldbm) {
        this.ldbm = ldbm;
    }

    public String getLdh() {
        return ldh;
    }

    public void setLdh(String ldh) {
        this.ldh = ldh;
    }

    public String getDys() {
        return dys;
    }

    public void setDys(String dys) {
        this.dys = dys;
    }

    public String getLcs() {
        return lcs;
    }

    public void setLcs(String lcs) {
        this.lcs = lcs;
    }

    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}

