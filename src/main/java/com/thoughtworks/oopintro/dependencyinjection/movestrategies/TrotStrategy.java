package com.thoughtworks.oopintro.dependencyinjection.movestrategies;

public class TrotStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.print("Trots");
    }
}
