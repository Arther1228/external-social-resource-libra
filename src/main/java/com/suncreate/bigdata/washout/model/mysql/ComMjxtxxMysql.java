package com.suncreate.bigdata.washout.model.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_mjxtxx")
public class ComMjxtxxMysql {
    @Id
    private String id;
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
    private Date addTime;

}
