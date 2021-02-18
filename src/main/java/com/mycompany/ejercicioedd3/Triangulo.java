/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicioedd3;

import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class Triangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Datos triangle = new Datos();
        
        System.out.println("¿Cual es la altura del triángulo?");
        Scanner reader = new Scanner (System.in);
        triangle.setHeight( reader.nextFloat());
        
        System.out.println("¿Cual es la base del triángulo?");
        triangle.setBase( reader.nextFloat());
        
        System.out.println("El area del triangulo es : " + triangle.calculateArea());
        
        Datos triangle2 = new Datos((float) 7.5,4);
        
        System.out.println("El area del segundo triangulo es : " + triangle2.calculateArea());
    }
    
}
