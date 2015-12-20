package com.thoughtworks.oop_intro.exceptions;

import java.io.BufferedReader;
import java.io.IOException;

public class CheckoutBookCommand implements Command {
    private Library library;
    private BufferedReader reader;

    public CheckoutBookCommand(Library library, BufferedReader reader) {
        this.library = library;
        this.reader = reader;
    }

    @Override
    public void execute() {
        String bookTitle = null;
        try {
            bookTitle = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        library.checkOut(bookTitle);
    }
}
