package com.suncreate.bigdata.washout.model.libra;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "com_jzxx", schema = "vision_if", catalog = "shiny")
public class ComJzxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String fwbm;
    private String yhzgxdm;
    private String glryid;
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

    public String getFwbm() {
        return fwbm;
    }

    public void setFwbm(String fwbm) {
        this.fwbm = fwbm;
    }

    public String getYhzgxdm() {
        return yhzgxdm;
    }

    public void setYhzgxdm(String yhzgxdm) {
        this.yhzgxdm = yhzgxdm;
    }

    public String getGlryid() {
        return glryid;
    }

    public void setGlryid(String glryid) {
        this.glryid = glryid;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

}

