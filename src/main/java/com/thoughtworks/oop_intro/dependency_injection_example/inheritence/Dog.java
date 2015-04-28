package com.thoughtworks.oop_intro.dependency_injection_example.inheritence;

public class Dog extends Animal {
    @Override
    public String name() {
        return "Dog";
    }

    @Override
    public void move() {
        System.out.print("trots");
    }

    @Override
    public void speak() {
        System.out.print("woof");
    }
}
