package com.thoughtworks.oop_intro.exceptions;

public class ShowBooksCommand implements Command {
    private Library library;

    public ShowBooksCommand(Library library) {
        this.library = library;
    }

    @Override
    public void execute() {
        library.showBooks();
    }
}
