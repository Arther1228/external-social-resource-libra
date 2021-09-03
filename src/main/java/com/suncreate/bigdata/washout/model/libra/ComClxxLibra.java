package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "com_clxx", schema = "vision_if", catalog = "shiny")
public class ComClxxLibra {
    @Id
    private String id;
    @Column(name = "appkey")
    private String appKey;
    private String cphm;
    private String xqbm;
    private String czxm;
    @Column(name = "czsfzjhm")
    private String czSfzjhm;
    @Column(name = "czsjhm")
    private String czSjhm;
    private String hplxdm;
    private String hpysdm;
    private String csysdm;
    private String clppdm;
    private String cllxdm;
    private String bz;
    @Column(name = "addtime")
    private Date addTime;

}

