package com.enigma.model;

public class Robot {
    Directions directions;
    private Integer postX=0;
    private Integer postY=0;
    private final String F="F";
    private final String B="B";
    private final String R="R";
    private final String L="L";
    private char [] commands;

    public Robot(Directions directions, Integer postX, Integer postY, char[] commands) {
        this.directions = directions;
        this.postX = postX;
        this.postY = postY;
        this.commands = commands;
    }

    public String getPost(){
        return "(" + postX + "," + postY + ")";
    }

    public String run(Directions directions){
        for (int i=0; i<this.commands.length; i++){
            move(String.valueOf(this.commands[i]), this.directions);
            System.out.println(this.commands[i] + getPost() + " " + this.directions);
        }
        return "";
    }

    public void getLeft(){
        this.directions = this.directions.toLeft();
    }

    public void getRight(){
        this.directions = this.directions.toRight();
    }

    public void move(String movement){
        if (movement.equals(R)) {
            toRight();
        }
        if (movement.equals(L)){
            toLeft();
        }
        if (movement.equals(F)){
            moveForward();
        }
        if (movement.equals(B)){
            moveBackward();
        }else{ }
    }

    public void moveForward(){
        if (directions.equals(Directions.NORTH)){
            postX++;
            this.directions=this.directions.NORTH;
        }else if (directions.equals(Directions.EAST)){
            postX--;
            this.directions=this.directions.EAST;
        }if (directions.equals(Directions.SOUTH)){
            postX++;
            this.directions=this.directions.SOUTH;
        }if (directions.equals(Directions.WEST)){
            postX--;
            this.directions=this.directions.WEST;
        }else {

        }
    }

    public void moveBackward(){
        if (directions.equals(Directions.NORTH)){
            postX--;
            this.directions=this.directions.NORTH;
        }else if (directions.equals(Directions.EAST)){
            postX++;
            this.directions=this.directions.EAST;
        }if (directions.equals(Directions.SOUTH)){
            postX--;
            this.directions=this.directions.SOUTH;
        }if (directions.equals(Directions.WEST)){
            postX++;
            this.directions=this.directions.WEST;
        }else {
        }
    }

}
