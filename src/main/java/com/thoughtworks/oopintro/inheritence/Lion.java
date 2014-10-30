package com.thoughtworks.oopintro.inheritence;

public class Lion extends Cat {
    public Lion() {
        super("Lion");
    }

    @Override
    public String speak() {
        return "Roar";
    }
}
