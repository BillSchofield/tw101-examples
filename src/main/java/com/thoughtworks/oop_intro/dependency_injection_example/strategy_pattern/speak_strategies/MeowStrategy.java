package com.thoughtworks.oop_intro.dependency_injection_example.strategy_pattern.speak_strategies;

import com.thoughtworks.oop_intro.dependency_injection_example.strategy_pattern.animal.SpeakStrategy;

public class MeowStrategy implements SpeakStrategy {
    @Override
    public void speak() {
        System.out.print("meow");
    }
}
