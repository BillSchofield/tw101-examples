package com.thoughtworks.oop_intro.exceptions;


public class RuntimeIOException extends RuntimeException {
    public RuntimeIOException(Exception e) {
        super(e);
    }
}
