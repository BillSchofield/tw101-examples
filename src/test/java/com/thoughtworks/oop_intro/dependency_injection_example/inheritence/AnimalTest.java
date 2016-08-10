package com.thoughtworks.oop_intro.dependency_injection_example.inheritence;

import org.junit.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class AnimalTest {

    @Test
    public void shouldMoveWhenActing() {
        Cat cat = new Cat();
        cat.act();

        // Since we aren't returning anything from cat.act() what can we check/assert?
        // Hint: Dependency injection is the answer to software design questions 60% of the time.
    }
}