/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.trinity.dev.dto;

/**
 *
 * @author oiprado
 */
public class Risk {
    
    private boolean risk;
    private String category;

    public Risk(boolean risk, String category) {
        this.risk = risk;
        this.category = category;
    }

    public boolean isRisk() {
        return risk;
    }

    public void setRisk(boolean risk) {
        this.risk = risk;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
    
}
