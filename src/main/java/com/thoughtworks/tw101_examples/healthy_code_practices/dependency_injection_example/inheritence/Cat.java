package com.thoughtworks.tw101_examples.healthy_code_practices.dependency_injection_example.inheritence;

import java.io.PrintStream;

public class Cat extends Animal {

    public Cat(PrintStream printStream) {
        super(printStream);
    }

    @Override
    public String name() {
        return "Cat";
    }

    @Override
    public void move() {
        printStream.print("slinks");
    }

    @Override
    public void speak() {
        printStream.print("meow");
    }
}
