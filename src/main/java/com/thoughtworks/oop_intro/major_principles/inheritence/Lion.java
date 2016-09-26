package com.thoughtworks.oop_intro.major_principles.inheritence;

public class Lion extends Cat {
    public Lion() {
        super("Lion");
    }

    @Override
    public String speak() {
        return "Roar";
    }
}
