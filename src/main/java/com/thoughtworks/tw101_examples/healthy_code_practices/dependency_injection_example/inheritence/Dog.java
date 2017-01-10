package com.thoughtworks.tw101_examples.healthy_code_practices.dependency_injection_example.inheritence;

import java.io.PrintStream;

public class Dog extends Animal {
    public Dog(PrintStream printStream) {
        super(printStream);
    }

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
