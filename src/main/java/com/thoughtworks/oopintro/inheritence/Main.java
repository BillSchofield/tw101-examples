package com.thoughtworks.oopintro.inheritence;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cat houseCat = new HouseCat();
        Cat lion = new Lion();

        List<Cat> cats = new ArrayList<Cat>();
        cats.add(houseCat);
        cats.add(lion);

        for (Cat cat : cats) {
            moveAndSpeak(cat);
        }

        System.out.println();
        System.out.println("Both house cats and tigers slink because they inherit their movement from Cat");
        System.out.println("This means that ALL cats slink.");
    }

    private static void moveAndSpeak(Cat cat) {
        System.out.print("The ");
        cat.name();
        System.out.print(" ");
        cat.move();
        System.out.print(" and then says ");
        cat.speak();
        System.out.println();
    }
}
