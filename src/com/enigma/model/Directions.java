package com.enigma.model;

public enum Directions {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Directions toLeft(){
        return Directions.valueOf([ordinal()+1)%3];
    }
    public Directions toRight(){
        return Directions.valueOf([ordinal()+3)%3];
    }
}
