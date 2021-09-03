package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_rkxx", schema = "vision_if", catalog = "shiny")
public class ComRkxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String xqbm;
    private String xm;
    private String xbdm;
    private String zjlxdm;
    private String zjhm;
    private String sjhm;
    @Column(name = "ryzp")
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
    @Column(name = "addtime")
    private Date addTime;

}

