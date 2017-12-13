/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kov2.controllers;

import java.awt.Point;
import kov2.model.Field;
import kov2.model.Figure;
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
public class WinnerControllerTest {
    
//    public WinnerControllerTest() {
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
     * Test of getWinner method, of class WinnerController.
     */
    @Test
    public void testGetWinnerWhenWinnerRow() throws Exception {
        
        final Field fieldForSize = new Field(3);
        final int size = fieldForSize.getSize();
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i<size; i++) {
            final Field field = new Field(3);
        field.setFigure(new Point (i, 0), Figure.X);
        field.setFigure(new Point (i, 1), Figure.X);
        field.setFigure(new Point (i, 2), Figure.X);
        
        assertEquals(Figure.X, winnerController.getWinner(field));
//        Figure expResult = null;
//        Figure result = instance.getWinner(field);
//        
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    }
    
    
     @Test
    public void testGetWinnerWhenNoWinnerRow() throws Exception {
        
        final Field fieldForSize = new Field(3);
        final int size = fieldForSize.getSize();
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i<size; i++) {
            final Field field = new Field(3);
        field.setFigure(new Point (i, 0), Figure.X);
        field.setFigure(new Point (i, 1), Figure.X);
        field.setFigure(new Point (i, 2), Figure.O);
        assertNull(winnerController.getWinner(field));

    }
    }
    
     @Test
    public void testGetWinnerWhenNoWinnerRow2() throws Exception {
        
        final Field fieldForSize = new Field(3);
        final int size = fieldForSize.getSize();
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i<size; i++) {
            final Field field = new Field(3);
        field.setFigure(new Point (i, 0), Figure.O);
        field.setFigure(new Point (i, 1), Figure.X);
        field.setFigure(new Point (i, 2), Figure.X);
        assertNull(winnerController.getWinner(field));

    }
    }
    
    
    
    @Test
    public void testGetWinnerWhenWinnerColumn() throws Exception {
        
        final Field fieldForSize = new Field(3);
        final int size = fieldForSize.getSize();
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i<size; i++) {
            final Field field = new Field(3);
        field.setFigure(new Point (0, i), Figure.X);
        field.setFigure(new Point (1, i), Figure.X);
        field.setFigure(new Point (2, i), Figure.X);
       assertEquals(Figure.X, winnerController.getWinner(field));

    }
    }
    
    
     @Test
    public void testGetWinnerWhenNoWinnerColumn() throws Exception {
        
        final Field fieldForSize = new Field(3);
        final int size = fieldForSize.getSize();
        final WinnerController winnerController = new WinnerController();
        for (int i = 0; i<size; i++) {
            final Field field = new Field(3);
        field.setFigure(new Point (0, i), Figure.X);
        field.setFigure(new Point (1, i), Figure.X);
        field.setFigure(new Point (2, i), Figure.O);
        
        assertNull(winnerController.getWinner(field));
        
        
        // TODO review the generated test code and remove the default call to fail.
       
    }
    }
    
     @Test
    public void testGetWinnerWhenWinnerDiagonal1() throws Exception {
        
        final Field fieldForSize = new Field(3);
        final int size = fieldForSize.getSize();
        final WinnerController winnerController = new WinnerController();
        
            final Field field = new Field(3);
        field.setFigure(new Point (0, 0), Figure.X);
        field.setFigure(new Point (1, 1), Figure.X);
        field.setFigure(new Point (2, 2), Figure.X);
       assertEquals(Figure.X, winnerController.getWinner(field));

    }
    
     @Test
    public void testGetWinnerWhenNoWinnerDiagonal1() throws Exception {
        
        final Field fieldForSize = new Field(3);
        final int size = fieldForSize.getSize();
        final WinnerController winnerController = new WinnerController();
        
            final Field field = new Field(3);
        field.setFigure(new Point (0, 0), Figure.X);
        field.setFigure(new Point (1, 1), Figure.X);
        field.setFigure(new Point (2, 2), Figure.O);
       assertNull(winnerController.getWinner(field));

    }
    
    
    @Test
    public void testGetWinnerWhenWinnerDiagonal2() throws Exception {
        
        final Field fieldForSize = new Field(3);
        final int size = fieldForSize.getSize() -1;
        final WinnerController winnerController = new WinnerController();
        
            final Field field = new Field(3);
        field.setFigure(new Point (0, size), Figure.X);
        field.setFigure(new Point (1, 1), Figure.X);
        field.setFigure(new Point (size, 0), Figure.X);
       assertEquals(Figure.X, winnerController.getWinner(field));

    }
    
     @Test
    public void testGetWinnerWhenNoWinnerDiagonal2() throws Exception {
        
        final Field fieldForSize = new Field(3);
        final int size = fieldForSize.getSize() -1;
        final WinnerController winnerController = new WinnerController();
        
            final Field field = new Field(3);
        field.setFigure(new Point (0, size), Figure.X);
        field.setFigure(new Point (1, 1), Figure.X);
        field.setFigure(new Point (size, 0), Figure.O);
       assertNull(winnerController.getWinner(field));

    }
}
