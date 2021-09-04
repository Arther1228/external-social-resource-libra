package com.suncreate.bigdata.washout.model.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_zpj")
public class ComZpjMysql {
    @Id
    private String id;
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
    private Date addTime;
    private Date updateTime;

}
