package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_ldxx", schema = "vision_if", catalog = "shiny")
public class ComldxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String xqbm;
    private String ldbm;
    private String ldh;
    private String dys;
    private String lcs;
    private String jd;
    private String wd;
    private String hs;
    @Column(name = "addtime")
    private Date addTime;

}

