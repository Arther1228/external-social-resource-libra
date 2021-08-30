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

    public String getXm() {
        return xm;
    }

    public void setXm(String xm) {
        this.xm = xm;
    }

    public String getXbdm() {
        return xbdm;
    }

    public void setXbdm(String xbdm) {
        this.xbdm = xbdm;
    }

    public String getZjlxdm() {
        return zjlxdm;
    }

    public void setZjlxdm(String zjlxdm) {
        this.zjlxdm = zjlxdm;
    }

    public String getZjhm() {
        return zjhm;
    }

    public void setZjhm(String zjhm) {
        this.zjhm = zjhm;
    }

    public String getSjhm() {
        return sjhm;
    }

    public void setSjhm(String sjhm) {
        this.sjhm = sjhm;
    }

    public String getRyZp() {
        return ryZp;
    }

    public void setRyZp(String ryZp) {
        this.ryZp = ryZp;
    }

    public String getRklxdm() {
        return rklxdm;
    }

    public void setRklxdm(String rklxdm) {
        this.rklxdm = rklxdm;
    }

    public String getCsrq() {
        return csrq;
    }

    public void setCsrq(String csrq) {
        this.csrq = csrq;
    }

    public String getZzmmdm() {
        return zzmmdm;
    }

    public void setZzmmdm(String zzmmdm) {
        this.zzmmdm = zzmmdm;
    }

    public String getYxqqsrq() {
        return yxqqsrq;
    }

    public void setYxqqsrq(String yxqqsrq) {
        this.yxqqsrq = yxqqsrq;
    }

    public String getYxqjzrq() {
        return yxqjzrq;
    }

    public void setYxqjzrq(String yxqjzrq) {
        this.yxqjzrq = yxqjzrq;
    }

    public String getZjzp() {
        return zjzp;
    }

    public void setZjzp(String zjzp) {
        this.zjzp = zjzp;
    }

    public String getJgdm() {
        return jgdm;
    }

    public void setJgdm(String jgdm) {
        this.jgdm = jgdm;
    }

    public String getZjdxz() {
        return zjdxz;
    }

    public void setZjdxz(String zjdxz) {
        this.zjdxz = zjdxz;
    }

    public String getHjdxz() {
        return hjdxz;
    }

    public void setHjdxz(String hjdxz) {
        this.hjdxz = hjdxz;
    }

    public String getGjdm() {
        return gjdm;
    }

    public void setGjdm(String gjdm) {
        this.gjdm = gjdm;
    }

    public String getYwx() {
        return ywx;
    }

    public void setYwx(String ywx) {
        this.ywx = ywx;
    }

    public String getYwm() {
        return ywm;
    }

    public void setYwm(String ywm) {
        this.ywm = ywm;
    }

    public String getMzdm() {
        return mzdm;
    }

    public void setMzdm(String mzdm) {
        this.mzdm = mzdm;
    }

    public String getZjxydm() {
        return zjxydm;
    }

    public void setZjxydm(String zjxydm) {
        this.zjxydm = zjxydm;
    }

    public String getWhcddm() {
        return whcddm;
    }

    public void setWhcddm(String whcddm) {
        this.whcddm = whcddm;
    }

    public String getHyzkdm() {
        return hyzkdm;
    }

    public void setHyzkdm(String hyzkdm) {
        this.hyzkdm = hyzkdm;
    }

    public String getByzkdm() {
        return byzkdm;
    }

    public void setByzkdm(String byzkdm) {
        this.byzkdm = byzkdm;
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