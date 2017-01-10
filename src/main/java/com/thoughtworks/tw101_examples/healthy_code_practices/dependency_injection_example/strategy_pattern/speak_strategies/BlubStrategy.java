package com.thoughtworks.tw101_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.speak_strategies;

import com.thoughtworks.tw101_examples.healthy_code_practices.dependency_injection_example.strategy_pattern.animal.SpeakStrategy;

public class BlubStrategy implements SpeakStrategy {
    @Override
    public void speak() {
        System.out.print("blub");

    }
}
