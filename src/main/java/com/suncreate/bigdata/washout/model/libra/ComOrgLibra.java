package com.suncreate.bigdata.washout.model.libra;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "com_org", schema = "vision_if", catalog = "shiny")
public class ComOrgLibra {
    @Id
    @GeneratedValue(generator = "orgGenerator")
    @GenericGenerator(name = "orgGenerator", strategy = "uuid")
    private String id;
    private String ssqxzqhdm;
    private String xqbm;
    private String xqmc;
    private String ldbm;
    private String ldh;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSsqxzqhdm() {
        return ssqxzqhdm;
    }

    public void setSsqxzqhdm(String ssqxzqhdm) {
        this.ssqxzqhdm = ssqxzqhdm;
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

    public String getLdbm() {
        return ldbm;
    }

    public void setLdbm(String ldbm) {
        this.ldbm = ldbm;
    }

    public String getLdh() {
        return ldh;
    }

    public void setLdh(String ldh) {
        this.ldh = ldh;
    }
}

