package com.thoughtworks.oopintro.dependencyinjection.movestrategies;

public class SwimStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.print("Swims");
    }
}
