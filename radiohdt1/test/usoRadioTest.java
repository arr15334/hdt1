/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Rodrigo Arriaza;
 */
public class usoRadioTest {
    
    public usoRadioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setFrecuencia method, of class usoRadio.
     */
    @Test
    public void testSetFrecuencia() {
        System.out.println("setFrecuencia");
        boolean frecuencia = false;
        usoRadio instance = new usoRadio();
        instance.setFrecuencia(frecuencia);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setEncendido method, of class usoRadio.
     */
    @Test
    public void testSetEncendido() {
        System.out.println("setEncendido");
        boolean encendido = true;
        usoRadio instance = new usoRadio();
        instance.setEncendido(encendido);
        // TODO review the generated test code and remove the default call to fail.
      
    }

    /**
     * Test of setEmisora method, of class usoRadio.
     */
    @Test
    public void testSetEmisora() {
        System.out.println("setEmisora");
        double emisora = 87.9;
        usoRadio instance = new usoRadio();
        
        double expResult = 87.9;
        instance.setEmisora(emisora);
        // TODO review the generated test code and remove the default call to fail.
       
    }

    /**
     * Test of saveEmisora method, of class usoRadio.
     */
    @Test
    public void testSaveEmisora() {
        System.out.println("saveEmisora");
        int btn = 1;
        double emisora = 87.2;
        usoRadio instance = new usoRadio();
        instance.saveEmisora(btn, emisora);
        // TODO review the generated test code and remove the default call to fail.
    
    }

    /**
     * Test of selectEmisora method, of class usoRadio.
     */
    @Test
    public void testSelectEmisora() {
        System.out.println("selectEmisora");
        int btn = 1;
        usoRadio instance = new usoRadio();
        double expResult = 87.9;
        double result = instance.selectEmisora(btn);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEncendido method, of class usoRadio.
     */
    @Test
    public void testGetEncendido() {
        System.out.println("getEncendido");
        usoRadio instance = new usoRadio();
        boolean expResult = true;
        boolean result = instance.getEncendido();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getFrecuencia method, of class usoRadio.
     */
    @Test
    public void testGetFrecuencia() {
        System.out.println("getFrecuencia");
        usoRadio instance = new usoRadio();
        boolean expResult = true;
        boolean result = instance.getFrecuencia();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        
    }

    /**
     * Test of getEmisora method, of class usoRadio.
     */
    @Test
    public void testGetEmisora() {
        System.out.println("getEmisora");
        usoRadio instance = new usoRadio();
        double expResult = 87.9;
        double result = instance.getEmisora();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
      
    }
    
}
