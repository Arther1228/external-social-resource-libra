package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Entity
@Table(name = "com_cldzxx", schema = "vision_if", catalog = "shiny")
public class ComCldzxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String dzbm;
    private String xqbm;
    private String dzmc;
    private String zpjbms;
    private String crkbm;
    private String tplj;
    @Column(name = "addtime")
    private Date addTime;

}

