/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kov2.model;

/**
 *
 * @author lena
 */
public class Player {
    private final String name;
    private final Figure figure;

    public Player(final String name, final Figure figure) {
        this.name = name;
        this.figure = figure;
    }

    public String getName() {
        return name;
    }

    public Figure getFigure() {
        return figure;
    }
            
}
