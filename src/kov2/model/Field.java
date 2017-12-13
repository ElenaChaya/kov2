/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kov2.model;

import java.awt.Point;
import kov2.model.exceptions.AlreadyOccupiedException;
import kov2.model.exceptions.InvalidPointException;
//import kov2.model.exceptions.AlreadyOccupiedException;
/**
 *
 * @author lena
 */
public class Field {
    
    private static final int MIN_COORDINATE = 0;
    
    private final Figure[][] field;
    private final int field_size;

    public Field(final int field_size) {
        this.field_size = field_size;
         this.field = new Figure[field_size][field_size];
    }
    
    public int getSize() {
        return field_size;
    }

    public Figure getFigure(final Point point) throws InvalidPointException {
        if(!checkPoint(point)) {
            throw new InvalidPointException();
        }
        return field[point.x][point.y];
    }
    public void setFigure(final Point point, final Figure figure) throws InvalidPointException {
        if(!checkPoint(point)) {
            throw new InvalidPointException();
        }
        
        field[point.x][point.y] = figure;
    }
    
    private boolean checkPoint(final Point point) {
            return checkCoordinate(point.x, field.length) && checkCoordinate(point.y, field[point.x].length);
        }
    
    private boolean checkCoordinate(final int coordinate, final int maxCoordinate) {
        return coordinate >= MIN_COORDINATE && coordinate < maxCoordinate;
    }
    
}
