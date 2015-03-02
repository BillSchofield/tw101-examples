package com.thoughtworks.oopintro.collections;


import org.hamcrest.CoreMatchers;
import org.junit.Before;
import org.junit.Test;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.junit.Assert.assertThat;

public class HashSetTest {

    private Set<String> setOfStrings;

    @Before
    public void setUp() throws Exception {
        setOfStrings = new HashSet<String>();
    }

    @Test
    public void shouldBeACollection(){
        assertThat(setOfStrings, is(instanceOf(Collection.class)));
    }

    @Test
    public void shouldNotAddDuplicate(){
        setOfStrings.add("a");
        setOfStrings.add("a");

        assertThat(setOfStrings, hasSize(equalTo(1)));
    }

    @Test
    public void shouldNotBeInOrderAdded(){
        setOfStrings.add("bb");
        setOfStrings.add("aa");

        String[] inOrder = {"bb", "aa"};

        String[] actual = new String[2];
        setOfStrings.toArray(actual);

        assertThat(actual, is(not(inOrder)));
    }

}