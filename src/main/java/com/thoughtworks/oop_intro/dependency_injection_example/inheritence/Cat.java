package com.thoughtworks.oop_intro.dependency_injection_example.inheritence;

public class Cat extends Animal {
    @Override
    public String name() {
        return "Cat";
    }

    @Override
    public void move() {
        System.out.print("slinks");
    }

    @Override
    public void speak() {
        System.out.print("meow");
    }
}
