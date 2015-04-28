package com.thoughtworks.oop_intro.dependency_injection_example.polymorphism;

public class Dog implements Animal {
    @Override
    public void act() {
        System.out.println("The Dog trots and then says woof");
    }
}
