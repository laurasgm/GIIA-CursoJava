/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laurasgm.calculadora;

/**
 *
 * @author Laura
 */
public class Hexadecimal {
    
    
    /*Convierte un numero de hexadecimal a decimal*/
     public String hexadecimaltodecimal (String numero){
        int numdec = Integer.parseInt(numero, 16);
        String decimal = Integer.toString(numdec);
        return decimal;
        
    }
     
     public String hexadecimaltobinario (String numero){
        
        int numbina = Integer.parseInt(numero, 16);
        String binary = Integer.toBinaryString(numbina);
        return binary;
     }
    
}
