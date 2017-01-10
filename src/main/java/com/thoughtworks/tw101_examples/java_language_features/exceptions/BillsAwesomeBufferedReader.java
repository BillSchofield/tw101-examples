package com.thoughtworks.tw101_examples.java_language_features.exceptions;

import java.io.BufferedReader;
import java.io.IOException;

public class BillsAwesomeBufferedReader {
    private final BufferedReader bufferReader;

    public BillsAwesomeBufferedReader(BufferedReader bufferReader) {
        this.bufferReader = bufferReader;
    }

    public String readLine() {
        try {
            return bufferReader.readLine();
        } catch (IOException e) {
            throw new RuntimeIOException(e);
        }
    }
}
