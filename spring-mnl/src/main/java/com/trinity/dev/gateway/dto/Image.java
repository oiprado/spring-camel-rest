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
public class Image implements Serializable{
    
    private String image;

    public Image() {
    }
    
    public Image(String image) {
        this.image = image;
    }
    
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
    
}
