package com.thoughtworks.tw101_examples.testing_loops;

import org.junit.Test;

import java.io.BufferedReader;

import static org.mockito.Mockito.mock;

public class ApplicationTest {

    @Test
    public void shouldShouldContinueUntilUserQuits() {
        BufferedReader bufferedReader = mock(BufferedReader.class);
        Menu menu = mock(Menu.class);
        Application application = new Application(menu);

        application.start();
    }

}