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
public class Operaciones {
    
    /*operacion suma de dos numeros*/
     public double suma(double a, double b){
        
        return a + b;
    }
    
     /*operacion multiplicacion de dos numeros*/
    public double multiplicacion(double a, double b){
        
        return a * b;
    }
    
    /*operacion division de dos numeros*/
    public double division(double a, double b){
        if(b == 0){
            System.out.println("division por cero?");
        }
        
        return a / b;
    }
    
    /*operacion resta de dos numeros*/
    public double resta(double a, double b){
        
        return a - b;
    }
    
    /*operacion invertir un numero*/
    public double invertido (double a){
        
        return 1/a;
    }
    
}
