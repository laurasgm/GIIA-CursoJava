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
public class Decimal {
    
    
    /*Convierte un numero de decimal a hexadecimal*/
    public String decimaltohexadecimal(String numero){
        int resul = Integer.parseInt(numero);
        return Integer.toHexString(resul);
    }
    
    /*Convierte un numero de decimal a binario*/
    public String decimaltobinario(String numero){
        int resul = Integer.parseInt(numero);
        return Integer.toBinaryString(resul);
    }
    
}
