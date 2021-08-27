package com.suncreate.bigdata.washout.model.libra;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "com_clxx", schema = "vision_if", catalog = "shiny")
public class ComClxxLibra {
    private String id;
    private String appkey;
    private String cphm;
    private String xqbm;
    private String czxm;
    private String czSfzjhm;
    private String czSjhm;
    private String hplxdm;
    private String hpysdm;
    private String csysdm;
    private String clppdm;
    private String cllxdm;
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

    @Column(name = "cphm")
    public String getCphm() {
        return cphm;
    }

    public void setCphm(String cphm) {
        this.cphm = cphm;
    }

    @Column(name = "xqbm")
    public String getXqbm() {
        return xqbm;
    }

    public void setXqbm(String xqbm) {
        this.xqbm = xqbm;
    }

    @Column(name = "czxm")
    public String getCzxm() {
        return czxm;
    }

    public void setCzxm(String czxm) {
        this.czxm = czxm;
    }

    @Column(name = "czsfzjhm")
    public String getCzSfzjhm() {
        return czSfzjhm;
    }

    public void setCzSfzjhm(String czSfzjhm) {
        this.czSfzjhm = czSfzjhm;
    }

    @Column(name = "czsjhm")
    public String getCzSjhm() {
        return czSjhm;
    }

    public void setCzSjhm(String czSjhm) {
        this.czSjhm = czSjhm;
    }

    @Column(name = "hplxdm")
    public String getHplxdm() {
        return hplxdm;
    }

    public void setHplxdm(String hplxdm) {
        this.hplxdm = hplxdm;
    }

    @Column(name = "hpysdm")
    public String getHpysdm() {
        return hpysdm;
    }

    public void setHpysdm(String hpysdm) {
        this.hpysdm = hpysdm;
    }

    @Column(name = "csysdm")
    public String getCsysdm() {
        return csysdm;
    }

    public void setCsysdm(String csysdm) {
        this.csysdm = csysdm;
    }

    @Column(name = "clppdm")
    public String getClppdm() {
        return clppdm;
    }

    public void setClppdm(String clppdm) {
        this.clppdm = clppdm;
    }

    @Column(name = "cllxdm")
    public String getCllxdm() {
        return cllxdm;
    }

    public void setCllxdm(String cllxdm) {
        this.cllxdm = cllxdm;
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

