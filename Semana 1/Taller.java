/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sesion2;
import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */

public class Taller {
    
    /*Imprime los numeros del 1 al 100, que no terminen en 2 ni en 5*/
    public void contador(){
         for( int i=0; i<=100; i++){
            if(i%10!=2 && i%10!=5){
                System.out.println(i);
            }                
         }
    }
    
    /*Imprime los numeros pares entre 1539 y 2505*/
    public void contadorp(){
        for(int i=1539; i <=2505; i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
       
    
    /*Obtiene la entrada del usuario usando los argumentos de línea de comandos para imprimir todos los argumentos en pantalla*/
    public void arguments(String[] args){
        for(int i=0;i<args.length;i++){
            System.out.println(args[i]);
        }
    }
    
    /*Obtiene dos números por parte del usuario utilizando los argumentos de la línea de comandos e imprimir la suma, la resta, la multiplicación y la división de los dos números*/
    public static void arguments2(String[] args){
        int suma = Integer.parseInt(args[0]);
        int resta = Integer.parseInt(args[0]);
        int multi = Integer.parseInt(args[0]);
        int div =  Integer.parseInt(args[0]);
        
        for(int i=1;i<args.length;i++){
             suma+= Integer.parseInt(args[i]);
             resta = resta - Integer.parseInt(args[i]);
             multi = multi * Integer.parseInt(args[i]);
             div = div/Integer.parseInt(args[i]) ;
            
        }
        System.out.println(suma);
        System.out.println(resta);
        System.out.println(multi);
        System.out.println(div);
    }
    
    /*Usando BufferedReader, Scanner y JOptionPane pida 3 palabras y muestre*/
    public void entradawithB(){
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        
        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        System.out.println("Ingrese la cadena: ");
        try{
             System.out.println("Introduzca la palabra 1: ");
             palabra1 = dataIn.readLine();
             System.out.println("Introduzca la palabra 2: ");
             palabra2 = dataIn.readLine();
             System.out.println("Introduzca la palabra 3: ");
             palabra3 = dataIn.readLine();
             
        }catch(IOException e){
            System.out.println("Error");
        }
        System.out.println(palabra1 +" "+ palabra2+" "+ palabra3);
    }
    
    public void entradawithS(){
        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        
        Scanner scanIn = new Scanner(System.in);
        
        System.out.println("Introduzca la palabra 1: ");
        palabra1 = scanIn.nextLine();
        System.out.println("Introduzca la palabra 2: ");
        palabra2 = scanIn.nextLine();
        System.out.println("Introduzca la palabra 3: ");
        palabra3 = scanIn.nextLine();
        
        System.out.println(palabra1 +" "+ palabra2+" "+ palabra3);
        
    }
    
    public void entradawithJO(){
        String palabra1 = "";
        String palabra2 = "";
        String palabra3 = "";
        
        palabra1 = JOptionPane.showInputDialog("Introduzca la palabra 1");
        palabra2 = JOptionPane.showInputDialog("Introduzca la palabra 2");
        palabra3 = JOptionPane.showInputDialog("Introduzca la palabra 3");
        
        String msg = palabra1 +" "+ palabra2+" "+ palabra3;
        JOptionPane.showMessageDialog(null, msg);
    }
    
    /*Genera un numero aleatorio de 1 a 100, el programa termina cuando el usuario logra adivinar el numero*/
    public void adivinar(){
        
        int numero = new java.util.Random().nextInt(100);
        System.out.println(numero);
        
        String eleccion = JOptionPane.showInputDialog("Introduzca un numero");
        while(Integer.parseInt(eleccion)!= numero){
            if(Integer.parseInt(eleccion) < numero){
                JOptionPane.showMessageDialog(null,"Fallaste, el numero es mayor");
                eleccion = JOptionPane.showInputDialog("Introduzca un numero");
            }else{
                JOptionPane.showMessageDialog(null,"Fallaste, el numero es menor");
                eleccion = JOptionPane.showInputDialog("Introduzca un numero");
            }
        }
        JOptionPane.showMessageDialog(null,"Ganaste");
        
    }

}
