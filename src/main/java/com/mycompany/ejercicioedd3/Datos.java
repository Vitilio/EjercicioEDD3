/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;
/**
 *
 * @author Usuario
 */
public class Datos {
    private float base;
    private float height;
    
    public Datos(float base, float height){
        this.base = base;
        this.height = height;
    }
    
    public Datos() {
        
    }
    /**
     * This function returns the value of the area of the triangle.
     * @return area of the triangle.
     */
    public float calculateArea(){
        return(base * height)/2;
    }
  
    
    public float getBase() {
        return base;
    }

    public void setBase(float base) {
        this.base = base;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }
    
}

