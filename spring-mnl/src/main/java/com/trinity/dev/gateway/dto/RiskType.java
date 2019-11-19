/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.gateway.dto;

import java.io.Serializable;

/**
 *
 * @author oiprado
 */
public class RiskType implements Serializable {
    
    private int riskTypeId;

    public RiskType() {
    }

    public RiskType(int riskTypeId) {
        this.riskTypeId = riskTypeId;
    }

    public int getRiskTypeId() {
        return riskTypeId;
    }

    public void setRiskTypeId(int riskTypeId) {
        this.riskTypeId = riskTypeId;
    }    
    
}
