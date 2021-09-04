package com.suncreate.bigdata.washout.model.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_cldzxx")
public class ComCldzxxMysql {
    @Id
    private String id;
    private String appKey;
    private String dzbm;
    private String xqbm;
    private String dzmc;
    private String zpjbms;
    private String crkbm;
    private String tplj;
    private Date addTime;
    private Date updateTime;

}
