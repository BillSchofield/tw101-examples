package com.thoughtworks.oop_intro.dependency_injection_example.strategy_pattern.move_strategies;

import com.thoughtworks.oop_intro.dependency_injection_example.strategy_pattern.animal.MoveStrategy;

public class TrotStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.print("trots");
    }
}
