package com.thoughtworks.oopintro.collections;


import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

public class HashMapTest {

    private Map<String, String> stringToStringMap;

    @Before
    public void setUp() {
        stringToStringMap = new HashMap<String, String>();
    }

    @Test
    public void shouldOverwriteOldEntry(){
        stringToStringMap.put("1", "a");
        stringToStringMap.put("1", "b");

        assertThat(stringToStringMap.get("1"), is("b"));
    }

    @Test
    public void shouldNotPutKeysInOrderAdded(){
        stringToStringMap.put("aaa", "");
        stringToStringMap.put("b", "");


        String[] inOrderAdded = {"aa", "b"};

        Set<String> keySet = stringToStringMap.keySet();
        String[] keys = new String[2];
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