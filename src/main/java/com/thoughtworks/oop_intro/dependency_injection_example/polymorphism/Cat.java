package com.thoughtworks.oop_intro.dependency_injection_example.polymorphism;

public class Cat implements Animal{
    @Override
    public void act() {
        System.out.println("The Cat slinks and then says meow");
    }
}
