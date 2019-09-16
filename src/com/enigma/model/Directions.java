package com.enigma.model;

public enum Directions {
    NORTH,
    EAST,
    SOUTH,
    WEST;

     Directions toLeft(){
        return Directions.values()[(ordinal()+1)%4];
    }
     Directions toRight(){
        return Directions.values()[(ordinal()+3)%4];
    }
}
