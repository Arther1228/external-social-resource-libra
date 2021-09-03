package com.suncreate.bigdata.washout.model.mysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "com_mjxtxx")
public class ComMjxtxxMysql {
    @Id
    private String id;
    private String appKey;
    private String mjxtbm;
    private String mjxtmc;
    private String xqbm;
    private String fx;
    private String jd;
    private String wd;
    private String mlx;
    private String mjlx;
    private String mjxtlx;
    private String ldbm;
    private String dyh;
    private String crkbm;
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

    public String getMjxtbm() {
        return mjxtbm;
    }

    public void setMjxtbm(String mjxtbm) {
        this.mjxtbm = mjxtbm;
    }

    public String getMjxtmc() {
        return mjxtmc;
    }

    public void setMjxtmc(String mjxtmc) {
        this.mjxtmc = mjxtmc;
    }

    public String getXqbm() {
        return xqbm;
    }

    public void setXqbm(String xqbm) {
        this.xqbm = xqbm;
    }

    public String getFx() {
        return fx;
    }

    public void setFx(String fx) {
        this.fx = fx;
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

    public String getMlx() {
        return mlx;
    }

    public void setMlx(String mlx) {
        this.mlx = mlx;
    }

    public String getMjlx() {
        return mjlx;
    }

    public void setMjlx(String mjlx) {
        this.mjlx = mjlx;
    }

    public String getMjxtlx() {
        return mjxtlx;
    }

    public void setMjxtlx(String mjxtlx) {
        this.mjxtlx = mjxtlx;
    }

    public String getLdbm() {
        return ldbm;
    }

    public void setLdbm(String ldbm) {
        this.ldbm = ldbm;
    }

    public String getDyh() {
        return dyh;
    }

    public void setDyh(String dyh) {
        this.dyh = dyh;
    }

    public String getCrkbm() {
        return crkbm;
    }

    public void setCrkbm(String crkbm) {
        this.crkbm = crkbm;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
