package com.thoughtworks.oopintro.dependencyinjection;

import com.thoughtworks.oopintro.dependencyinjection.movestrategies.SlinkStrategy;
import com.thoughtworks.oopintro.dependencyinjection.movestrategies.SwimStrategy;
import com.thoughtworks.oopintro.dependencyinjection.movestrategies.TrotStrategy;
import com.thoughtworks.oopintro.dependencyinjection.speakstrategies.BarkStrategy;
import com.thoughtworks.oopintro.dependencyinjection.speakstrategies.BlubStrategy;
import com.thoughtworks.oopintro.dependencyinjection.speakstrategies.MeowStrategy;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("Dog", new BarkStrategy(), new TrotStrategy()));
        animals.add(new Animal("Cat", new MeowStrategy(), new SlinkStrategy()));
        animals.add(new Animal("Fish", new BlubStrategy(), new SwimStrategy()));

        for (Animal animal : animals) {
            animal.act();
        }


    }
}
