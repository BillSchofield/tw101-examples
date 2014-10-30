package com.thoughtworks.oopintro.inheritence;

public class HouseCat extends Cat {
    public HouseCat() {
        super("House Cat");
    }

    @Override
    public String speak() {
        return "Meow";
    }

}
