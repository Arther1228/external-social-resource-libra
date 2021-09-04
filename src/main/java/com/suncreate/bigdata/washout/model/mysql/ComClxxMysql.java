/**
 * @filename:ComDict 2021年7月13日
 * @project community-collect  V1.0
 * Copyright(c) 2020 suncreate Co. Ltd.
 * All right reserved.
 */
package com.suncreate.bigdata.washout.model.mysql;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "com_clxx")
public class ComClxxMysql {
    @Id
    private String id;
    private String appKey;
    private String cphm;
    private String xqbm;
    private String czxm;
    private String czSfzjhm;
    private String czSjhm;
    private String hplxdm;
    private String hpysdm;
    private String csysdm;
    private String clppdm;
    private String cllxdm;
    private String bz;
    private Date addTime;
    private Date updateTime;

}
