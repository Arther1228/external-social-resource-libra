package com.suncreate.bigdata.washout.model.mysql;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

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

    public String getCarNo() {
        return carNo;
    }

    public void setCarNo(String carNo) {
        this.carNo = carNo;
    }

    public String getGateNo() {
        return gateNo;
    }

    public void setGateNo(String gateNo) {
        this.gateNo = gateNo;
    }

    public String getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
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
