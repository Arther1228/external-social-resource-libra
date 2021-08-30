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

    public String getFwbm() {
        return fwbm;
    }

    public void setFwbm(String fwbm) {
        this.fwbm = fwbm;
    }

    public String getDyh() {
        return dyh;
    }

    public void setDyh(String dyh) {
        this.dyh = dyh;
    }

    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    public String getFwztdm() {
        return fwztdm;
    }

    public void setFwztdm(String fwztdm) {
        this.fwztdm = fwztdm;
    }

    public String getLch() {
        return lch;
    }

    public void setLch(String lch) {
        this.lch = lch;
    }

    public String getFwytdm() {
        return fwytdm;
    }

    public void setFwytdm(String fwytdm) {
        this.fwytdm = fwytdm;
    }

    public String getCqxzdm() {
        return cqxzdm;
    }

    public void setCqxzdm(String cqxzdm) {
        this.cqxzdm = cqxzdm;
    }

    public String getFwmj() {
        return fwmj;
    }

    public void setFwmj(String fwmj) {
        this.fwmj = fwmj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}