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
public class Factura extends Precio {
    String emisor,cliente;
    
    public void imprimirFactura(){
        setPesos(100);
        System.out.println(this.pesos);
    }
}
