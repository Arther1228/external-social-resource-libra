/**
 * @filename:ComDict 2021年7月13日
 * @project community-collect  V1.0
 * Copyright(c) 2020 suncreate Co. Ltd.
 * All right reserved.
 */
package com.suncreate.bigdata.washout.model.mysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "com_rlzpjl")
public class ComRlzpjlMysql {
    @Id
    private String id;
    private String appKey;
    private String snapNo;
    private String areaNo;
    private String snapTime;
    private String snapSmallImage;
    private String snapBigImage;
    private Date addTime;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getSnapNo() {
        return snapNo;
    }

    public void setSnapNo(String snapNo) {
        this.snapNo = snapNo;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getSnapTime() {
        return snapTime;
    }

    public void setSnapTime(String snapTime) {
        this.snapTime = snapTime;
    }

    public String getSnapSmallImage() {
        return snapSmallImage;
    }

    public void setSnapSmallImage(String snapSmallImage) {
        this.snapSmallImage = snapSmallImage;
    }

    public String getSnapBigImage() {
        return snapBigImage;
    }

    public void setSnapBigImage(String snapBigImage) {
        this.snapBigImage = snapBigImage;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }
}
