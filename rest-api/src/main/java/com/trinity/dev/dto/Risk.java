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
    
    private String response;
    
//    private boolean risk;
//    private String category;
//    private String image;
//
//    public Risk(boolean risk, String category, String image) {
//        this.risk = risk;
//        this.category = category;
//        this.image = image;
//    }
//    
//    public boolean isRisk() {
//        return risk;
//    }
//
//    public void setRisk(boolean risk) {
//        this.risk = risk;
//    }
//
//    public String getCategory() {
//        return category;
//    }
//
//    public void setCategory(String category) {
//        this.category = category;
//    }
//
//    public String getImage() {
//        return image;
//    }
//
//    public void setImage(String image) {
//        this.image = image;
//    }

    public Risk(String response) {
        this.response = response;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    
    
}
