package com.thoughtworks.oop_intro.dependency_injection_example.polymorphism;

public class Fish implements Animal{

    @Override
    public void act() {
        System.out.println("The Fish swims and then says blub");
    }
}
