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
public class Game {
    private final Player[] players;
    private final Field field;
    private final String name;

    public Game(final Player[] players, final Field field, final String name) {
        this.players = players;
        this.field = field;
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public Field getField() {
        return field;
    }

    public String getName() {
        return name;
    }
    
    
    
}
