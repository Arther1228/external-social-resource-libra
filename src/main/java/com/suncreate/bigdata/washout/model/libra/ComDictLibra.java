package com.suncreate.bigdata.washout.model.libra;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "com_dict", schema = "vision_if", catalog = "shiny")
public class ComDictLibra {
    @Id
    private String id;
    @Column(name = "dictcode")
    private String dictCode;
    @Column(name = "dictclass")
    private String dictClass;
    @Column(name = "dicttypename")
    private String dictTypeName;
    @Column(name = "dicttypevalue")
    private String dictTypeValue;
    @Column(name = "dictsource")
    private String dictSource;
    private String project;
    @Column(name = "addtime")
    private Date addTime;

}
