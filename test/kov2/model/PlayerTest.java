/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kov2.model;

import kov2.model.Figure;
import kov2.model.Player;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author lena
 */
public class PlayerTest {
    
//    public PlayerTest() {
//    }
//    
//    @BeforeClass
//    public static void setUpClass() {
//    }
//    
//    @AfterClass
//    public static void tearDownClass() {
//    }
//    
//    @Before
//    public void setUp() {
//    }
//    
//    @After
//    public void tearDown() {
//    }

    /**
     * Test of getName method, of class Player.
     */
    @Test
    public void testGetName() throws Exception{
        
        final String inputValue = "Slava";
        final String expectedValue = "Slava";
        
        
        final Player player = new Player(inputValue, null);
        final String actualValue = player.getName();
         assertEquals(expectedValue, actualValue);
//        System.out.println("getName");
//        Player instance = null;
//        String expResult = "";
//        String result = instance.getName();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getFigure method, of class Player.
     */
    @Test
    public void testGetFigure() {
        final Figure inputValue = Figure.X;
        final Figure expectedValue = Figure.X;
        
        
        final Player player = new Player(null, inputValue);
        final Figure actualValue = player.getFigure();
         assertEquals(expectedValue, actualValue);
//        System.out.println("getFigure");
//        Player instance = null;
//        Figure expResult = null;
//        Figure result = instance.getFigure();
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
