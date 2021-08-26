package com.suncreate.bigdata.washout.model.libra;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "com_dict", schema = "vision_if", catalog = "shiny")
public class ComDictLibra {
    private String id;
    private String dictCode;
    private String dictClass;
    private String dictTypeName;
    private String dictTypeValue;
    private String dictSource;
    private String project;
    private Date addTime;

    @Id
    @Column(name = "id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dictcode")
    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    @Basic
    @Column(name = "dictclass")
    public String getDictClass() {
        return dictClass;
    }

    public void setDictClass(String dictClass) {
        this.dictClass = dictClass;
    }

    @Basic
    @Column(name = "dicttypename")
    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    @Basic
    @Column(name = "dicttypevalue")
    public String getDictTypeValue() {
        return dictTypeValue;
    }

    public void setDictTypeValue(String dictTypeValue) {
        this.dictTypeValue = dictTypeValue;
    }

    @Basic
    @Column(name = "dictsource")
    public String getDictSource() {
        return dictSource;
    }

    public void setDictSource(String dictSource) {
        this.dictSource = dictSource;
    }

    @Basic
    @Column(name = "project")
    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    @Basic
    @Column(name = "addtime")
    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
