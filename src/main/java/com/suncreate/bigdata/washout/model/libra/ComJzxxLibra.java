package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_jzxx", schema = "vision_if", catalog = "shiny")
public class ComJzxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String fwbm;
    private String yhzgxdm;
    private String glryid;
    @Column(name = "addtime")
    private Date addTime;

}

