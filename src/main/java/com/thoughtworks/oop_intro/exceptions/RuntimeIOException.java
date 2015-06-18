package com.thoughtworks.oop_intro.exceptions;

import java.io.IOException;

public class RuntimeIOException extends RuntimeException {
    public RuntimeIOException(Exception e) {
        super(e);
    }
}
