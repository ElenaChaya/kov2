/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kov2.model;

import java.awt.Point;
import kov2.model.exceptions.AlreadyOccupiedException;
import kov2.model.exceptions.InvalidPointException;

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
public class FieldTest {
    
    public FieldTest() {
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
     * Test of getSize method, of class Field.
     * @throws java.lang.Exception
     */
    @Test
    public void testGetSize() throws Exception{
//        System.out.println("getSize");
        final Field field = new Field();
        int expResult = 3;
//        int result = field.getSize();
        assertEquals(expResult, field.getSize());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getField method, of class Field.
     */
//    @Test
//    public void testGetField() {
//        System.out.println("getField");
//        Point point = null;
//        Field instance = new Field();
//        Figure expResult = null;
//        Figure result = instance.getField(point);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }

    /**
     * Test of setFigure method, of class Field.
     * @throws java.lang.Exception
     */
    @Test
    public void testSetFigure() throws Exception {
//        System.out.println("setFigure");
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;
        final Field field= new Field();
        field.setFigure(inputPoint, inputFigure);
        final Figure actualFigure = field.getFigure(inputPoint);
        // TODO review the generated test code and remove the default call to fail.
       // fail("The test case is a prototype.");
        assertEquals(inputFigure, actualFigure);
    }
    
    @Test
    public void testGetFigureWhenFigureIsNotSet() throws Exception {

        final Point inputPoint = new Point(0, 0);

        final Field field= new Field();

        final Figure actualFigure = field.getFigure(inputPoint);

        assertNull(actualFigure);
    }
    
    @Test
    public void testGetFigureWhenXIsLessThenZero() throws Exception {

        final Point inputPoint = new Point(-1, 0);

        final Field field= new Field();
try{
        field.getFigure(inputPoint);
        fail();
}catch (final InvalidPointException e){}
        
    }
    
    
    @Test
    public void testGetFigureWhenYIsLessThenZero() throws Exception {

        final Point inputPoint = new Point(0, -1);

        final Field field= new Field();
try{
        field.getFigure(inputPoint);
        fail();
}catch (final InvalidPointException e){}
        
    }
    
    
    @Test
    public void testGetFigureWhenXIsMoreThenSize() throws Exception {

        

        final Field field= new Field();
        final Point inputPoint = new Point(field.getSize()+1, 0);
try{
        field.getFigure(inputPoint);
        fail();
}catch (final InvalidPointException e){}
        
    }
    
    
    @Test
    public void testGetFigureWhenYIsMoreThenSize() throws Exception {

        

        final Field field= new Field();
        final Point inputPoint = new Point(0, field.getSize()+1);
try{
        field.getFigure(inputPoint);
        fail();
}catch (final InvalidPointException e){}
        
    }
    
    
    @Test
    public void testSetFigureWhenAlreadyOccupied() throws Exception {

        

        final Field field= new Field();
        final Point inputPoint = new Point(0, 0);
        final Figure inputFigure = Figure.O;
        field.setFigure(inputPoint, inputFigure);
try{
        field.setFigure(inputPoint, inputFigure);
        fail();
}catch (final AlreadyOccupiedException e){}
        
    }
}
