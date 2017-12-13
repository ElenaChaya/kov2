/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kov2.controllers;

import java.awt.Point;
import kov2.model.Field;
import kov2.model.Figure;
import kov2.model.exceptions.AlreadyOccupiedException;
import kov2.model.exceptions.InvalidPointException;

/**
 *
 * @author lena
 */
public class MoveController {
    public void applyPicture(final Field field, final Point point, final Figure figure) throws InvalidPointException,
                                                                          AlreadyOccupiedException  {
        if(field.getFigure(point)!=null)  {
            throw new AlreadyOccupiedException();
        }
        field.setFigure(point, figure);
    }
}
