package com.thoughtworks.oopintro.dependencyinjection.speakstrategies;

public class MeowStrategy implements SpeakStrategy {
    @Override
    public void speak() {
        System.out.print("Meow");
    }
}
