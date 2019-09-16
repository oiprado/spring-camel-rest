/*
 * To change this license header; choose License Headers in Project Properties.
 * To change this template file; choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.gateway.dto;

/**
 *
 * @author oiprado
 */
public class RiskDetail {
    private Integer riskTypeId; 
    private Integer organizationId;
    private String description; 
    private Double lat;  
    private Double lng;
    private String municipalityCode;
    private String alertLevel;
    private String username;
    private String file;

    public RiskDetail() {
    }

    public RiskDetail(Integer riskTypeId, Integer organizationId, String description, Double lat, Double lng, String municipalityCode, String alertLevel, String username, String file) {
        this.riskTypeId = riskTypeId;
        this.organizationId = organizationId;
        this.description = description;
        this.lat = lat;
        this.lng = lng;
        this.municipalityCode = municipalityCode;
        this.alertLevel = alertLevel;
        this.username = username;
        this.file = file;
    }
    
    public Integer getRiskTypeId() {
        return riskTypeId;
    }

    public void setRiskTypeId(Integer riskTypeId) {
        this.riskTypeId = riskTypeId;
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLat() {
        return lat;
    }

    public void setLat(Double lat) {
        this.lat = lat;
    }

    public Double getLng() {
        return lng;
    }

    public void setLng(Double lng) {
        this.lng = lng;
    }

    public String getMunicipalityCode() {
        return municipalityCode;
    }

    public void setMunicipalityCode(String municipalityCode) {
        this.municipalityCode = municipalityCode;
    }

    public String getAlertLevel() {
        return alertLevel;
    }

    public void setAlertLevel(String alertLevel) {
        this.alertLevel = alertLevel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }
    
}
