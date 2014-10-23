package com.thoughtworks.oopintro.exceptions.whycheckedexceptionsareterrible;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Player> players = new ArrayList<Player>();
        players.add(new HumanPlayer("Bill"));
        players.add(new RandomPlayer("Lisa"));
        players.add(new AlwaysRockPlayer("Bart"));

        for (Player player : players) {
            player.play();
        }
    }
}
