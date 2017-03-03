package com.thoughtworks.tw101_examples.java_language_features.exceptions;

import com.sun.javaws.exceptions.InvalidArgumentException;

public class Parser {
    private IntegerParser integerParser;

    public Parser(IntegerParser integerParser) {

        this.integerParser = integerParser;
    }

    public int parse(String s) throws InvalidArgumentException {
        if (s == null){
            String[] strings = {s};
            throw new InvalidArgumentException(strings);
        }
        try {
            integerParser.parseInt();
        } catch (NumberFormatException exception){
            return 0;
        }
        return -1;
    }
}
