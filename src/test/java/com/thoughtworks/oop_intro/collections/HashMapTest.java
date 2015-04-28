package com.thoughtworks.oop_intro.collections;


import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.assertThat;

public class HashMapTest {

    private Map<String, String> stringToStringMap;

    public static void main(String[] args) throws IOException {

        Map<String, Integer> nameToAge = new TreeMap<>();

        nameToAge.put("Tiffany", 27);
        nameToAge.put("Sebastian", 23);
        nameToAge.put("Bill", 48);
        nameToAge.put("Biff", 48);
        nameToAge.put("Henry", 23);

//        System.out.println("Enter a name:");
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String name = reader.readLine();
//        System.out.println(name + "'s age is " + nameToAge.get(name));

        for (String n : nameToAge.keySet()) {
            System.out.println(n);
        }


    }

    @Before
    public void setUp() {
        stringToStringMap = new HashMap<>();
    }

    @Test
    public void shouldOverwriteOldEntry(){
        stringToStringMap.put("1", "a");
        stringToStringMap.put("1", "b");

        assertThat(stringToStringMap.get("1"), is("b"));
    }

    @Test
    public void shouldNotPutKeysInOrderAdded(){
        stringToStringMap.put("a", "");
        stringToStringMap.put("b", "");
        stringToStringMap.put("c", "");


        String[] inOrderAdded = {"a", "b", "c"};

        Set<String> keySet = stringToStringMap.keySet();
        String[] keys = new String[3];
        keySet.toArray(keys);

        assertThat(keys, is(not(inOrderAdded)));
    }

    @Test
    public void shouldNotPutKeysInAlphabeticalOrder(){
        stringToStringMap.put("c", "");
        stringToStringMap.put("a", "");


        String[] inAlphabeticalOrder = {"a", "c"};

        Set<String> keySet = stringToStringMap.keySet();
        String[] keys = new String[2];
        keySet.toArray(keys);

        assertThat(keys, is(not(inAlphabeticalOrder)));
    }

}