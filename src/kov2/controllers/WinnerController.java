/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kov2.controllers;

import java.awt.Point;
import kov2.model.Field;
import kov2.model.Figure;
import kov2.model.exceptions.InvalidPointException;

/**
 *
 * @author lena
 */
public class WinnerController {
    public Figure getWinner(final Field field) {
        final int size = field.getSize();
        try {
            for (int i= 0; i<size; i++){
        if (check(field, new Point(i,0), p -> new Point(p.x, p.y +1))) {
            return field.getFigure(new Point(i, 0));
        }
            } 
            for (int i= 0; i<size; i++){
        if (check(field, new Point(i,0), p -> new Point(p.x + 1, p.y))){
            return field.getFigure(new Point(0, i));
        }
        
            } 
        if (check(field, new Point(0, 0), p -> new Point(p.x+1, p.y +1))){
            return field.getFigure(new Point(0, 0));
        }
        if (check(field, new Point(0,size-1), p -> new Point(p.x+1, p.y -1))){
            return field.getFigure(new Point(1, 1));
        }
        
    } catch (InvalidPointException e) {
        e.printStackTrace();
    }
        return null;
    }
    
    private boolean check(final Field field, final Point currentPoint, final IPointGenerator pointGenerator) {
        final Figure currentFigure;
        final Figure nextFigure;
        final Point nextPoint = pointGenerator.next(currentPoint);
        try {
        
            currentFigure = field.getFigure(currentPoint);
            nextFigure = field.getFigure(currentPoint);
        }catch (InvalidPointException e) {
         return true;
    }  
        if (currentFigure == null) return false;
        if (currentFigure != nextFigure) return false;
        
        return check(field, nextPoint, pointGenerator);
    }
    private interface IPointGenerator {
        public Point next(final Point point);
    }
}

