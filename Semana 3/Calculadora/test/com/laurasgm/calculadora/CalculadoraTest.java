/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.laurasgm.calculadora;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Laura
 */
public class CalculadoraTest {
    
   
    Hexadecimal hex;
    
    @Before
    public void setUp() {
        hex = new Hexadecimal();
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void HextodecTest(){
        String ans,exp;
        ans = hex.hexadecimaltodecimal("AA");
        exp = "170";
        System.out.println(ans);
        assertEquals(ans,exp);
    }
    

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
