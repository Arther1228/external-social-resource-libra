package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
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

}
