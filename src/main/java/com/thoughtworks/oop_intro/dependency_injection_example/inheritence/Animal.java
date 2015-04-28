package com.thoughtworks.oop_intro.dependency_injection_example.inheritence;

public abstract class Animal {
    public void act(){
        System.out.print("The " + name() + " ");
        move();
        System.out.print(" and then says ");
        speak();
        System.out.println();
    }

    public abstract String name();
    public abstract void move();
    public abstract void speak();
}
