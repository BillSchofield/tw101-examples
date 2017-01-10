package com.thoughtworks.tw101_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.move_strategies;

import com.thoughtworks.tw101_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.animal.MoveStrategy;

public class SwimStrategy implements MoveStrategy {
    @Override
    public void move() {
        System.out.print("swims");
    }
}
