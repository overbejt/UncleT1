/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author josh
 */
public class MoneyTest {
    
    public MoneyTest() {
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
     * Test of getConverted method, of class Money.
     */
    @Test
    public void testGetConverted() {
        System.out.println("getConverted");
        String A = "";
        String B = "";
        Money instance = new Money();
        String expResult = "";
        String result = instance.getConverted(A, B);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setA method, of class Money.
     */
    @Test
    public void testSetA() {
        System.out.println("setA");
        String A = "";
        Money instance = new Money();
        instance.setA(A);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setB method, of class Money.
     */
    @Test
    public void testSetB() {
        System.out.println("setB");
        String B = "";
        Money instance = new Money();
        instance.setB(B);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
