package com.suncreate.bigdata.washout.model.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "com_xq")
public class ComXqMysql {
    @Id
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
    private Date updateTime;

}
