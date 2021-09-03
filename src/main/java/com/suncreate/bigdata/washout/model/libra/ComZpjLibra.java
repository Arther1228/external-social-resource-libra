package com.suncreate.bigdata.washout.model.libra;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "com_zpj", schema = "vision_if", catalog = "shiny")
public class ComZpjLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String zpjbm;
    private String mc;
    private String ip;
    private String xqbm;
    private String jd;
    private String wd;
    private String lx;
    private String fx;
    private String dkh;
    private String bbh;
    private String xh;
    private String bz;
    private String glyzh;
    private String glymm;
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

    public String getZpjbm() {
        return zpjbm;
    }

    public void setZpjbm(String zpjbm) {
        this.zpjbm = zpjbm;
    }

    public String getMc() {
        return mc;
    }

    public void setMc(String mc) {
        this.mc = mc;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getXqbm() {
        return xqbm;
    }

    public void setXqbm(String xqbm) {
        this.xqbm = xqbm;
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

    public String getLx() {
        return lx;
    }

    public void setLx(String lx) {
        this.lx = lx;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
    }

    public String getDkh() {
        return dkh;
    }

    public void setDkh(String dkh) {
        this.dkh = dkh;
    }

    public String getBbh() {
        return bbh;
    }

    public void setBbh(String bbh) {
        this.bbh = bbh;
    }

    public String getXh() {
        return xh;
    }

    public void setXh(String xh) {
        this.xh = xh;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getGlyzh() {
        return glyzh;
    }

    public void setGlyzh(String glyzh) {
        this.glyzh = glyzh;
    }

    public String getGlymm() {
        return glymm;
    }

    public void setGlymm(String glymm) {
        this.glymm = glymm;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
