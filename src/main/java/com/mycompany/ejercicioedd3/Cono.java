/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

/**
 * It contains the data of a cone in order to calculate its volume.
 * 
 * @author Víctor Blanco Rodrigo
 * @version 1.0
 */
public class Cono {
    private float Radius;
    private float Height;

    public Cono() {
    }

    

    public float getRadius() {
        return Radius;
    }

    public void setRadius(float Radius) {
        this.Radius = Radius;
    }

    public float getHeight() {
        return Height;
    }

    public void setHeight(float Height) {
        this.Height = Height;
    }
    
    public float calculateVolume(){
        return (float) ((Math.PI * Radius * Radius * Height)/3);
    }
    
    
    
}
