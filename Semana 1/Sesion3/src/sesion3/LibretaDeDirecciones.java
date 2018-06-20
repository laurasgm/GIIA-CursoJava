/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

import javax.swing.JOptionPane;

/**
 *
 * @author Laura
 */
public class LibretaDeDirecciones {
    
   
    RegistroLibreta [] libreta = new RegistroLibreta[100];

    private static int posicion=0;
    
    

    
    public void menu(){
        String op=JOptionPane.showInputDialog(null,"1. Añadir\n2. Borrar\n3. Ver todas las entradas\n4. Actualizar una entrada");
        int opp = Integer.parseInt(op);
        
        if (opp==1){
            añadir();
        }else if(opp==2){
            borrar();
        }else if(opp==3){
            mostrar();
        }else if(opp==4){
            actualizar();
        }
        
        
        
    }
    
    
    
    public void añadir(){
        
        String Nombre = JOptionPane.showInputDialog("Digite el nombre");
        String Direccion = JOptionPane.showInputDialog("Digite la direccion");
        String Email = JOptionPane.showInputDialog("Digite la direccion email");
        String NumeroT = JOptionPane.showInputDialog("Digite el numero telefonico");
        
        if(posicion<libreta.length){
            libreta[posicion]=new RegistroLibreta(Nombre,Direccion,Email,Integer.parseInt(NumeroT));
            
        }
        
            int op = JOptionPane.showConfirmDialog(null,"desea seguir agregando?","Mensaje!", JOptionPane.YES_NO_OPTION);
            
            if (op==0){
                posicion++;
                añadir();
            } else {
                menu();
            }
    }
    
    public void borrar(){
        
        String op2 = JOptionPane.showInputDialog("que posición desea borrar? RECUERDE QUE LAS POSICIONES INICIAN EN 0");
        int opp2 = Integer.parseInt(op2);
        libreta[opp2]= null;
        menu();
        
    }
    
    public void mostrar(){
        for(int i=0; i<libreta.length;i++)
            if(libreta[i]!=null)
            System.out.println(libreta[i].getNombre()+" "+libreta[i].getDireccion()+" "+libreta[i].getEmail()+" "+libreta[i].getNumeroT());           
        menu();
    }
    
    public void actualizar(){
        String op3 = JOptionPane.showInputDialog("Que entrada desea actualizar? RECUERDE QUE LAS POSICIONES INICIAN EN 0");
        int opp3 = Integer.parseInt(op3);
        int copy=posicion;
        posicion=opp3;
        añadir();
        posicion=copy;
        menu();

    }
         
       
        
 }
    

