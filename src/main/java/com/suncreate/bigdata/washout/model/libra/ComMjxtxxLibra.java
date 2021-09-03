package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_mjxtxx", schema = "vision_if", catalog = "shiny")
public class ComMjxtxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String mjxtbm;
    private String mjxtmc;
    private String xqbm;
    private String fx;
    private String jd;
    private String wd;
    private String mlx;
    private String mjlx;
    private String mjxtlx;
    private String ldbm;
    private String dyh;
    private String crkbm;
    @Column(name = "addtime")
    private Date addTime;

}
