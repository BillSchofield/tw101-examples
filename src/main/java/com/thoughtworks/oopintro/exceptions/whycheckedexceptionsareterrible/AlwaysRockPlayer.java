package com.thoughtworks.oopintro.exceptions.whycheckedexceptionsareterrible;

public class AlwaysRockPlayer implements Player {
    private String name;

    public AlwaysRockPlayer(String name) {
        this.name = name;
    }

    @Override
    public void play() {
        System.out.println(name + " throws Rock");
    }
}
