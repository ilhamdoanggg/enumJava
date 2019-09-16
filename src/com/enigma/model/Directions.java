package com.enigma.model;

public enum Directions {
    NORTH,
    WEST,
    EAST,
    SOUTH;

    Directions toLeft(){
        return Directions.valueOf()[ordinal()+1%3];
    }
    Directions toRight(){
        return Directions.valueOf()[ordinal()+3%3];
    }
}
