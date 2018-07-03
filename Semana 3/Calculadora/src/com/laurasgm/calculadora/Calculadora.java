/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laurasgm.calculadora;

import javax.swing.JOptionPane;
import java.io.*;

/**
 *
 * @author Laura
 */
public class Calculadora {
    
    

    public double suma(double a, double b){
        
        return a + b;
    }
    
    public double multiplicacion(double a, double b){
        
        return a * b;
    }
    
    public double division(double a, double b){
        
        return a / b;
    }
    public double resta(double a, double b){
        
        return a - b;
    }
    
    public static void validarDenominador(double b){
        if(b == 0){
            System.out.println("division por cero?");
        }
    }
    
    public static boolean ValidarNumero(String numero){
        
        try{
            Double.valueOf(numero);
            return true;
        }catch(NumberFormatException ex){}
        
        return false;
    }
    
    public int hextodec (String numero){
        return Integer.parseInt(numero, 16);
        
    }
    
    public int bitodec (String numero){
        return Integer.parseInt(numero, 2);
        
    }
    
    public String dectohex(String numero){
        int resul = Integer.parseInt(numero);
        return Integer.toHexString(resul);
    }
    
    public String dectobi(String numero){
        int resul = Integer.parseInt(numero);
        return Integer.toBinaryString(resul);
    }
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        //String operacion = JOptionPane.showInputDialog("Introduzca su operacion");
        
        Calculadora c = new Calculadora();
        double suma = 0;
        double resta = 0;
        double multi = 1;
        double div = 1;
        double a = 0;
        double b = 0;
        int pos=0;
        
        for(int i=0 ; i<args.length ; i++){
            switch(args[i]){
                case "+" :
                        a = Double.valueOf(args[pos]);
                        pos+=2;
                        //System.out.println("esto es a: " + a + "este es la pos "+ pos);                     
                        suma = c.suma(suma, a);
                        break;                        
                case "-":
                        a = Double.valueOf(args[pos]);
                        pos+=2;
                        System.out.println("esto es a: " + a + "este es la pos "+ pos);                     
                        resta = Math.abs(c.resta(resta,a));
                        break;
                case "x":
                        a = Double.valueOf(args[pos]);
                        pos+=2;
                        System.out.println("esto es a: " + a + "este es la pos "+ pos);                     
                        multi = c.multiplicacion(multi,a);
                        break;
                case "/":
                         b = Double.valueOf(args[pos]);
                         pos+=2;
                         a = Double.valueOf(args[i]);
                         if(b==0){validarDenominador(b);}
                         else{
                             div = c.division(a, b);
                         }
                         break;
            } 
        }
        //System.out.println(suma);
        System.out.println(resta);
        //System.out.println(multi);
        
        
        
        /*
        char c[];
        c = operacion.toCharArray();
        System.out.println(c[1]);*/
        
        
        //System.out.println(operacion.charAt(1));
        //Metodo charAt(pos)devuelve la letra indicada en la posicion
        
    }
    
}
