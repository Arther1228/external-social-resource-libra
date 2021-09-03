package com.suncreate.bigdata.washout.model.mysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "com_cldzxx")
public class ComCldzxxMysql {
    @Id
    private String id;
    private String appKey;
    private String dzbm;
    private String xqbm;
    private String dzmc;
    private String zpjbms;
    private String crkbm;
    private String tplj;
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

    public String getDzbm() {
        return dzbm;
    }

    public void setDzbm(String dzbm) {
        this.dzbm = dzbm;
    }

    public String getXqbm() {
        return xqbm;
    }

    public void setXqbm(String xqbm) {
        this.xqbm = xqbm;
    }

    public String getDzmc() {
        return dzmc;
    }

    public void setDzmc(String dzmc) {
        this.dzmc = dzmc;
    }

    public String getZpjbms() {
        return zpjbms;
    }

    public void setZpjbms(String zpjbms) {
        this.zpjbms = zpjbms;
    }

    public String getCrkbm() {
        return crkbm;
    }

    public void setCrkbm(String crkbm) {
        this.crkbm = crkbm;
    }

    public String getTplj() {
        return tplj;
    }

    public void setTplj(String tplj) {
        this.tplj = tplj;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
