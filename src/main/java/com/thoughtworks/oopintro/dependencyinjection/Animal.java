package com.thoughtworks.oopintro.dependencyinjection;

import com.thoughtworks.oopintro.dependencyinjection.movestrategies.MoveStrategy;
import com.thoughtworks.oopintro.dependencyinjection.speakstrategies.SpeakStrategy;

public class Animal {
    private String name;
    private SpeakStrategy speakStrategy;
    private MoveStrategy moveStrategy;

    public Animal(String name, SpeakStrategy speakStrategy, MoveStrategy moveStrategy) {
        this.name = name;
        this.speakStrategy = speakStrategy;
        this.moveStrategy = moveStrategy;
    }

    public void act() {
        System.out.print("The " + name + " ");
        moveStrategy.move();
        System.out.print(" and then says ");
        speakStrategy.speak();
        System.out.println();
    }

}
