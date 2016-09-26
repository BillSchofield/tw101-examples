package com.thoughtworks.oop_intro.major_principles.encapsulation.before;

public class Main {
    public static void main(String[] args) {
        Rover rover = new Rover();

        rover.setX(1);
        rover.setY(3);
        rover.setHeading("N");

        // Move Forward
        switch(rover.getHeading()){
            case "N":
                rover.setY(rover.getY() + 1);
                break;
            case "E":
                rover.setX(rover.getX() + 1);
                break;
            case "S":
                rover.setY(rover.getY() - 1);
                break;
            case "W":
                rover.setX(rover.getX() - 1);
                break;
        }

        // Report Position
        System.out.println(rover.getX() + " " + rover.getY() + " " + rover.getHeading());
    }
}
