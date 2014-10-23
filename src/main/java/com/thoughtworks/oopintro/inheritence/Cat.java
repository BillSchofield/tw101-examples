package com.thoughtworks.oopintro.inheritence;

public abstract class Cat {

    private String name;

    protected Cat(String name) {
        this.name = name;
    }

    public void name() {
        System.out.print(name);
    }

    public void move(){
        System.out.print("Slinks");
    }

    public abstract void speak();
}
