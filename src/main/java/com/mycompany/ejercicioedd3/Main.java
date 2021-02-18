/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;
import java.util.Scanner;
/**
 *It ask the user for the data of a cone and calculates its volume.
 *It displays the result on the screen. 
 * 
 * @author Victor Blanco Rodrigo
 * @version 1.0
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cono cone = new Cono();
        
        System.out.println("¿Cual es la altura del cono?");
        Scanner reader = new Scanner (System.in);
        cone.setHeight( reader.nextFloat());
        
        System.out.println("¿Cual es el radio de la base del cono?");
        cone.setRadius( reader.nextFloat());
        
        System.out.println("El volumen del cono es : " + cone.calculateVolume());
        
    }
    
}
