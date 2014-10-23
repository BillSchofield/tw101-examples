package com.thoughtworks.oopintro.exceptions.whycheckedexceptionsareterrible;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HumanPlayer implements Player {
    private String name;

    public HumanPlayer(String name) {

        this.name = name;
    }

    @Override
    public void play() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Please enter Rock, Scissors, or Paper");
        String choice = "";
        // We shouldn't be catching this exception here because we don't have the context to handle it.
        // So let's eliminate the try/catch block by adding "throws IOException" to the method signature
        try {
            choice = bufferedReader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(name + " throws " + choice);
    }
}
