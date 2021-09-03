package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_fwxx", schema = "vision_if", catalog = "shiny")
public class ComFwxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String xqbm;
    private String ldbm;
    private String fwbm;
    private String dyh;
    private String mph;
    private String fwztdm;
    private String lch;
    private String fwytdm;
    private String cqxzdm;
    private String fwmj;
    private String bz;
    @Column(name = "addtime")
    private Date addTime;

}

