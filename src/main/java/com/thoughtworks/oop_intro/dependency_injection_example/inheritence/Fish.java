package com.thoughtworks.oop_intro.dependency_injection_example.inheritence;

public class Fish extends Animal {
    @Override
    public String name() {
        return "Fish";
    }

    @Override
    public void move() {
        System.out.print("swims");
    }

    @Override
    public void speak() {
        System.out.println("blub");
    }
}
