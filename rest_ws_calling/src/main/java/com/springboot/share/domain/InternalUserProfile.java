package com.springboot.share.domain;

import java.util.Date;
import java.util.List;


public class InternalUserProfile {

    private String id;

    private String userId;
    private String englishName;
    private List<String> supportingRegions;
    private Date updatedAt;

    private Short version;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public List<String> getSupportingRegions() {
        return supportingRegions;
    }

    public void setSupportingRegions(List<String> supportingRegions) {
        this.supportingRegions = supportingRegions;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Short getVersion() {
        return version;
    }

    public void setVersion(Short version) {
        this.version = version;
    }
}
