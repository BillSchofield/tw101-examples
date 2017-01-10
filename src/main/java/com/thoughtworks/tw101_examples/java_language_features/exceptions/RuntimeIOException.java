package com.thoughtworks.tw101_examples.java_language_features.exceptions;


public class RuntimeIOException extends RuntimeException {
    public RuntimeIOException(Exception e) {
        super(e);
    }
}
