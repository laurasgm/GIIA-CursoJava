/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.utp.isc.laurasgm.sesion6BD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura
 */
public class ConexionH2 {
    
    
    public static void main(String[] args) throws SQLException{
        try {
            Class.forName("org.h2.Driver");
            Connection conn;
            conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/~/agenda","sa","");
            Statement st = conn.createStatement();
            
            st.execute("create table Persona(IDPersona int primary,"
                    + " nombre varchar(50),"
                    + " apellido varchar(50),"
                    + " fechaNacimiento date,"
                    + " IDdireccion int,"
                    + " IDemail int);");
            
            st.execute("create table direccion(IDdireccion int,"
                    + " nomenclatura varchar(50,"
                    + " barrio varchar(50),"
                    + " IDciudad int);");
            
            
            st.execute("create table email(IDemail int,"
                    + " email varchar(50),"
                    + " tipo varchar(50));");
            
            st.execute("create table ciudad(IDciudad int,"
                    + " nombre varchar(50)"
                    + " IDdepartamento int);");
            
            st.execute("create table departamento(IDdepartamento int,"
                    + " nombre varchar(50)"
                    + " IDpais int);");
            
            st.execute("create table pais(IDpais int,"
                    + " nombre varchar(50));");
            
            st.execute("create table usuario(IDusuario int,"
                    + "nombreusuario varchar(50),"
                    + "contraseña varchar(50),"
                    + "IDdirectorio int);");
            
            st.execute("create table directorio(IDdirectorio int,"
                    + "nombre varchar(50),"
                    + "IDgrupo int");//????
            
            st.execute("create table grupo(IDgrupo int,"
                    + "nombre varchar(50),");
            
            st.execute("create table registro(IDregistro int,"
                    + "alias varchar(50),"
                    + "cargo varchar(50),"
                    + "carrera varchar(50),"
                    + "foto varchar(50),"
                    + "IDdirectorio int);");
            
            st.execute("create table telefono(IDtelefono int,"
                    + "numerotel int);");
            
            //st.execute("drop table if exists Persona");
            
            System.out.println("se creo la tabla");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionH2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    
}
