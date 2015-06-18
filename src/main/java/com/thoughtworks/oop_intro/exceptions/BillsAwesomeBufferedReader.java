package com.thoughtworks.oop_intro.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

public class BillsAwesomeBufferedReader extends BufferedReader {
    public BillsAwesomeBufferedReader(Reader in) {
        super(in);
    }

    @Override
    public String readLine() {
        try {
            return super.readLine();
        } catch (IOException e) {
            throw new RuntimeIOException(e);
        }
    }
}
