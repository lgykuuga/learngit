package com.lgy.refactor.day03.marsrover;
import java.util.Arrays;

public class MarsRover {

    private int x;
    private int y;
    private String direction;

    public MarsRover(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void execute(String commands) {
        Arrays.asList(commands.split("")).forEach(this::executeSingleCommand);
    }

    private void executeSingleCommand(String command) {
        if ("M".equals(command)) {
            move();
        }
        else if("L".equals(command)) {
            turnLeft();
        }
        else if("R".equals(command)) {
            turnRight();
        }
    }

    private void turnRight() {
        if ("E".equals(this.direction)) {
            this.direction = "S";
        }
        else if ("S".equals(this.direction)) {
            this.direction = "W";
        }
        else if ("W".equals(this.direction)) {
            this.direction = "N";
        }
        else if ("N".equals(this.direction)) {
            this.direction = "E";
        }
    }

    private void turnLeft() {
        if ("E".equals(this.direction)) {
            this.direction = "N";
        }
        else if ("N".equals(this.direction)) {
            this.direction = "W";
        }
        else if ("W".equals(this.direction)) {
            this.direction = "S";
        }
        else if ("S".equals(this.direction)) {
            this.direction = "E";
        }
    }

    private void move() {
        if ("E".equals(this.direction)) {
            this.x += 1;
        }
        else if ("W".equals(this.direction)) {
            this.x -= 1;
        }
        else if ("N".equals(this.direction)) {
            this.y += 1;
        }
        else if ("S".equals(this.direction)) {
            this.y -= 1;
        }
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public String getDirection() {
        return this.direction;
    }
}