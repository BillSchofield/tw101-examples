package com.thoughtworks.oop_intro.major_principles.encapsulation.after;


public class Main {
    public static void main(String[] args) {
        Rover rover = new Rover(1, 3, "N");
        rover.moveForward();
        rover.reportPosition();
    }
}
