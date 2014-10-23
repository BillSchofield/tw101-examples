package com.thoughtworks.oopintro.inheritence;

public class HouseCat extends Cat {
    public HouseCat() {
        super("House Cat");
    }

    @Override
    public void speak() {
        System.out.print("Meow");
    }

}
