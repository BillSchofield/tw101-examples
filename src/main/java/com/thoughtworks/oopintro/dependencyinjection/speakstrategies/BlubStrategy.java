package com.thoughtworks.oopintro.dependencyinjection.speakstrategies;

public class BlubStrategy implements SpeakStrategy {
    @Override
    public void speak() {
        System.out.print("Blub");

    }
}
