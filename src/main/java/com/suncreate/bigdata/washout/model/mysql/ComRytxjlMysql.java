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
@Table(name = "com_rytxjl")
public class ComRytxjlMysql {
    @Id
    private String id;
    private String appKey;
    private String accessControlNo;
    private String areaNo;
    private String accessType;
    private String accessTime;
    private String cardNo;
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

    public String getAccessControlNo() {
        return accessControlNo;
    }

    public void setAccessControlNo(String accessControlNo) {
        this.accessControlNo = accessControlNo;
    }

    public String getAreaNo() {
        return areaNo;
    }

    public void setAreaNo(String areaNo) {
        this.areaNo = areaNo;
    }

    public String getAccessType() {
        return accessType;
    }

    public void setAccessType(String accessType) {
        this.accessType = accessType;
    }

    public String getAccessTime() {
        return accessTime;
    }

    public void setAccessTime(String accessTime) {
        this.accessTime = accessTime;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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
