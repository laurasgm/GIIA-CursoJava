/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sesion3;

/**
 *
 * @author Laura
 */
public class RegistroLibreta {
    
    String Nombre,Direccion,Email;
    int NumeroT; 

    public RegistroLibreta(String Nombre, String Direccion, String Email, int NumeroT) {
        this.Nombre = Nombre;
        this.Direccion = Direccion;
        this.Email = Email;
        this.NumeroT = NumeroT;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public int getNumeroT() {
        return NumeroT;
    }

    public void setNumeroT(int NumeroT) {
        this.NumeroT = NumeroT;
    }
    
    
    
}
