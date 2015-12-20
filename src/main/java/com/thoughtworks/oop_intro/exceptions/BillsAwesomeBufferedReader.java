package com.thoughtworks.oop_intro.exceptions;

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
