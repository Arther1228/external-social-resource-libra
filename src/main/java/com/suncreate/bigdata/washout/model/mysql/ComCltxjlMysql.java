package com.suncreate.bigdata.washout.model.mysql;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_cltxjl")
public class ComCltxjlMysql {
    @Id
    private String id;
    private String appKey;
    private String snapNo;
    private String areaNo;
    private String carNo;
    private String gateNo;
    private String accessTime;
    private String snapSmallImage;
    private String snapBigImage;
    private Date addTime;

}
