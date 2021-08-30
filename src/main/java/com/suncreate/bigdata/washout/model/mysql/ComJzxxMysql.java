/**
 * @filename:ComDict 2021年7月13日
 * @project community-collect  V1.0
 * Copyright(c) 2020 suncreate Co. Ltd.
 * All right reserved.
 */
package com.suncreate.bigdata.washout.model.mysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "com_jzxx")
public class ComJzxxMysql {
    @Id
    private String id;
    private String appKey;
    private String fwbm;
    private String yhzgxdm;
    private String glryid;
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