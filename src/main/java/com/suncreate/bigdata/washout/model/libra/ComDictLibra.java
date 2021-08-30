package com.suncreate.bigdata.washout.model.libra;

import javax.persistence.*;
import java.util.Date;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDictCode() {
        return dictCode;
    }

    public void setDictCode(String dictCode) {
        this.dictCode = dictCode;
    }

    public String getDictClass() {
        return dictClass;
    }

    public void setDictClass(String dictClass) {
        this.dictClass = dictClass;
    }

    public String getDictTypeName() {
        return dictTypeName;
    }

    public void setDictTypeName(String dictTypeName) {
        this.dictTypeName = dictTypeName;
    }

    public String getDictTypeValue() {
        return dictTypeValue;
    }

    public void setDictTypeValue(String dictTypeValue) {
        this.dictTypeValue = dictTypeValue;
    }

    public String getDictSource() {
        return dictSource;
    }

    public void setDictSource(String dictSource) {
        this.dictSource = dictSource;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
