package com.thoughtworks.oopintro.dependencyinjection.speakstrategies;

public class BarkStrategy implements SpeakStrategy {
    @Override
    public void speak() {
        System.out.print("Woof");
    }
}
