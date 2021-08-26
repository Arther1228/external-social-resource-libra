package com.suncreate.bigdata.washout.model.libra;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "com_xq", schema = "vision_if", catalog = "shiny")
public class ComXqLibra {
    private String id;
    private String appKey;
    private String xqbm;
    private String xqmc;
    private String ssqXzqhdm;
    private String gajgjgdm;
    private String sqdm;
    private String xxdz;
    private String wymc;
    private String jd;
    private String wd;
    private String dtzbj;
    private String tp;
    private String jscj;
    private String fzr;
    private String lxdh;
    private String jyxm;
    private String jybh;
    private String jylxfs;
    private String zdmj;
    private String bz;
    private String jzmj;
    private Date addTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "appkey")
    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    @Basic
    @Column(name = "xqbm")
    public String getXqbm() {
        return xqbm;
    }

    public void setXqbm(String xqbm) {
        this.xqbm = xqbm;
    }

    @Basic
    @Column(name = "xqmc")
    public String getXqmc() {
        return xqmc;
    }

    public void setXqmc(String xqmc) {
        this.xqmc = xqmc;
    }

    @Basic
    @Column(name = "ssqxzqhdm")
    public String getSsqXzqhdm() {
        return ssqXzqhdm;
    }

    public void setSsqXzqhdm(String ssqXzqhdm) {
        this.ssqXzqhdm = ssqXzqhdm;
    }

    @Basic
    @Column(name = "gajgjgdm")
    public String getGajgjgdm() {
        return gajgjgdm;
    }

    public void setGajgjgdm(String gajgjgdm) {
        this.gajgjgdm = gajgjgdm;
    }

    @Basic
    @Column(name = "sqdm")
    public String getSqdm() {
        return sqdm;
    }

    public void setSqdm(String sqdm) {
        this.sqdm = sqdm;
    }

    @Basic
    @Column(name = "xxdz")
    public String getXxdz() {
        return xxdz;
    }

    public void setXxdz(String xxdz) {
        this.xxdz = xxdz;
    }

    @Basic
    @Column(name = "wymc")
    public String getWymc() {
        return wymc;
    }

    public void setWymc(String wymc) {
        this.wymc = wymc;
    }

    @Basic
    @Column(name = "jd")
    public String getJd() {
        return jd;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    @Basic
    @Column(name = "wd")
    public String getWd() {
        return wd;
    }

    public void setWd(String wd) {
        this.wd = wd;
    }

    @Basic
    @Column(name = "dtzbj")
    public String getDtzbj() {
        return dtzbj;
    }

    public void setDtzbj(String dtzbj) {
        this.dtzbj = dtzbj;
    }

    @Basic
    @Column(name = "tp")
    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    @Basic
    @Column(name = "jscj")
    public String getJscj() {
        return jscj;
    }

    public void setJscj(String jscj) {
        this.jscj = jscj;
    }

    @Basic
    @Column(name = "fzr")
    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    @Basic
    @Column(name = "lxdh")
    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    @Basic
    @Column(name = "jyxm")
    public String getJyxm() {
        return jyxm;
    }

    public void setJyxm(String jyxm) {
        this.jyxm = jyxm;
    }

    @Basic
    @Column(name = "jybh")
    public String getJybh() {
        return jybh;
    }

    public void setJybh(String jybh) {
        this.jybh = jybh;
    }

    @Basic
    @Column(name = "jylxfs")
    public String getJylxfs() {
        return jylxfs;
    }

    public void setJylxfs(String jylxfs) {
        this.jylxfs = jylxfs;
    }

    @Basic
    @Column(name = "zdmj")
    public String getZdmj() {
        return zdmj;
    }

    public void setZdmj(String zdmj) {
        this.zdmj = zdmj;
    }

    @Basic
    @Column(name = "bz")
    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    @Basic
    @Column(name = "jzmj")
    public String getJzmj() {
        return jzmj;
    }

    public void setJzmj(String jzmj) {
        this.jzmj = jzmj;
    }

    @Basic
    @Column(name = "addtime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
