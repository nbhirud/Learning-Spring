/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nbhirud.spring;

/**
 *
 * @author nbhirud
 */
public class Triangle {
    
    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    
    
    public void draw() {
        System.out.println(getType()+" Triangle drawn");
    }
    
}
