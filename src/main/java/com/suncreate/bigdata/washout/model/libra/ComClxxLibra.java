package com.suncreate.bigdata.washout.model.libra;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "com_clxx", schema = "vision_if", catalog = "shiny")
public class ComClxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String cphm;
    private String xqbm;
    private String czxm;
    @Column(name = "czsfzjhm")
    private String czSfzjhm;
    @Column(name = "czsjhm")
    private String czSjhm;
    private String hplxdm;
    private String hpysdm;
    private String csysdm;
    private String clppdm;
    private String cllxdm;
    private String bz;
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

    public String getCphm() {
        return cphm;
    }

    public void setCphm(String cphm) {
        this.cphm = cphm;
    }

    public String getXqbm() {
        return xqbm;
    }

    public void setXqbm(String xqbm) {
        this.xqbm = xqbm;
    }

    public String getCzxm() {
        return czxm;
    }

    public void setCzxm(String czxm) {
        this.czxm = czxm;
    }

    public String getCzSfzjhm() {
        return czSfzjhm;
    }

    public void setCzSfzjhm(String czSfzjhm) {
        this.czSfzjhm = czSfzjhm;
    }

    public String getCzSjhm() {
        return czSjhm;
    }

    public void setCzSjhm(String czSjhm) {
        this.czSjhm = czSjhm;
    }

    public String getHplxdm() {
        return hplxdm;
    }

    public void setHplxdm(String hplxdm) {
        this.hplxdm = hplxdm;
    }

    public String getHpysdm() {
        return hpysdm;
    }

    public void setHpysdm(String hpysdm) {
        this.hpysdm = hpysdm;
    }

    public String getCsysdm() {
        return csysdm;
    }

    public void setCsysdm(String csysdm) {
        this.csysdm = csysdm;
    }

    public String getClppdm() {
        return clppdm;
    }

    public void setClppdm(String clppdm) {
        this.clppdm = clppdm;
    }

    public String getCllxdm() {
        return cllxdm;
    }

    public void setCllxdm(String cllxdm) {
        this.cllxdm = cllxdm;
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

