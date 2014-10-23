package com.thoughtworks.oopintro.exceptions.whycheckedexceptionsareterrible;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomPlayer implements Player {
    private String name;

    public RandomPlayer(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        List<String> choices = new ArrayList<String>();
        choices.add("Rock");
        choices.add("Scissors");
        choices.add("Paper");

        int randomNumber = new Random().nextInt(3);

        System.out.println(name + " throws " + choices.get(randomNumber));
    }
}
