package com.suncreate.bigdata.washout.model.libra;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "com_xq", schema = "vision_if", catalog = "shiny")
public class ComXqLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String xqbm;
    private String xqmc;
    @Column(name = "ssqxzqhdm")
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

    public String getXqbm() {
        return xqbm;
    }

    public void setXqbm(String xqbm) {
        this.xqbm = xqbm;
    }

    public String getXqmc() {
        return xqmc;
    }

    public void setXqmc(String xqmc) {
        this.xqmc = xqmc;
    }

    public String getSsqXzqhdm() {
        return ssqXzqhdm;
    }

    public void setSsqXzqhdm(String ssqXzqhdm) {
        this.ssqXzqhdm = ssqXzqhdm;
    }

    public String getGajgjgdm() {
        return gajgjgdm;
    }

    public void setGajgjgdm(String gajgjgdm) {
        this.gajgjgdm = gajgjgdm;
    }

    public String getSqdm() {
        return sqdm;
    }

    public void setSqdm(String sqdm) {
        this.sqdm = sqdm;
    }

    public String getXxdz() {
        return xxdz;
    }

    public void setXxdz(String xxdz) {
        this.xxdz = xxdz;
    }

    public String getWymc() {
        return wymc;
    }

    public void setWymc(String wymc) {
        this.wymc = wymc;
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


    public String getDtzbj() {
        return dtzbj;
    }

    public void setDtzbj(String dtzbj) {
        this.dtzbj = dtzbj;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getJscj() {
        return jscj;
    }

    public void setJscj(String jscj) {
        this.jscj = jscj;
    }

    public String getFzr() {
        return fzr;
    }

    public void setFzr(String fzr) {
        this.fzr = fzr;
    }

    public String getLxdh() {
        return lxdh;
    }

    public void setLxdh(String lxdh) {
        this.lxdh = lxdh;
    }

    public String getJyxm() {
        return jyxm;
    }

    public void setJyxm(String jyxm) {
        this.jyxm = jyxm;
    }

    public String getJybh() {
        return jybh;
    }

    public void setJybh(String jybh) {
        this.jybh = jybh;
    }

    public String getJylxfs() {
        return jylxfs;
    }

    public void setJylxfs(String jylxfs) {
        this.jylxfs = jylxfs;
    }

    public String getZdmj() {
        return zdmj;
    }

    public void setZdmj(String zdmj) {
        this.zdmj = zdmj;
    }

    public String getBz() {
        return bz;
    }

    public void setBz(String bz) {
        this.bz = bz;
    }

    public String getJzmj() {
        return jzmj;
    }

    public void setJzmj(String jzmj) {
        this.jzmj = jzmj;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
