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
@Table(name = "com_jzxx")
public class ComJzxxMysql {
    private String id;
    private String appkey;
    private String fwbm;
    private String yhzgxdm;
    private String glryid;
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
    public String getAppkey() {
        return appkey;
    }

    public void setAppkey(String appkey) {
        this.appkey = appkey;
    }

    @Column(name = "fwbm")
    public String getFwbm() {
        return fwbm;
    }

    public void setFwbm(String fwbm) {
        this.fwbm = fwbm;
    }

    @Column(name = "yhzgxdm")
    public String getYhzgxdm() {
        return yhzgxdm;
    }

    public void setYhzgxdm(String yhzgxdm) {
        this.yhzgxdm = yhzgxdm;
    }

    @Column(name = "glryid")
    public String getGlryid() {
        return glryid;
    }

    public void setGlryid(String glryid) {
        this.glryid = glryid;
    }

    @Column(name = "addtime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}