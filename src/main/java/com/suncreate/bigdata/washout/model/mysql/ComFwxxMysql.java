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
@Table(name = "com_fwxx")
public class ComFwxxMysql {
    private String id;
    private String appkey;
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

    @Column(name = "fwbm")
    public String getFwbm() {
        return fwbm;
    }

    public void setFwbm(String fwbm) {
        this.fwbm = fwbm;
    }

    @Column(name = "dyh")
    public String getDyh() {
        return dyh;
    }

    public void setDyh(String dyh) {
        this.dyh = dyh;
    }

    @Column(name = "mph")
    public String getMph() {
        return mph;
    }

    public void setMph(String mph) {
        this.mph = mph;
    }

    @Column(name = "fwztdm")
    public String getFwztdm() {
        return fwztdm;
    }

    public void setFwztdm(String fwztdm) {
        this.fwztdm = fwztdm;
    }

    @Column(name = "lch")
    public String getLch() {
        return lch;
    }

    public void setLch(String lch) {
        this.lch = lch;
    }

    @Column(name = "fwytdm")
    public String getFwytdm() {
        return fwytdm;
    }

    public void setFwytdm(String fwytdm) {
        this.fwytdm = fwytdm;
    }

    @Column(name = "cqxzdm")
    public String getCqxzdm() {
        return cqxzdm;
    }

    public void setCqxzdm(String cqxzdm) {
        this.cqxzdm = cqxzdm;
    }

    @Column(name = "fwmj")
    public String getFwmj() {
        return fwmj;
    }

    public void setFwmj(String fwmj) {
        this.fwmj = fwmj;
    }

    @Column(name = "bz")
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Column(name = "addtime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}