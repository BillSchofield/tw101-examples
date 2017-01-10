package com.thoughtworks.tw101_examples.object_oriented_principles.inheritence;

public class HouseCat extends Cat {
    public HouseCat() {
        super("House Cat");
    }

    @Override
    public String speak() {
        return "Meow";
    }

}
