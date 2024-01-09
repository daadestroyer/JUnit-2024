package org.example.AssertThat;

import org.junit.jupiter.api.Assertions;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

import org.junit.jupiter.api.Test;

public class AssertThatTest {

    @Test
    public void _Anything() {
        String tested = "Hello matcher logic";
        String check = "matcher";
        assertThat("Anything passes", tested, anything()); // this check which is anything() will always return true doesn't matter you pass something or not
    }

    @Test
    public void _Null() {
        String tested = null;
        assertThat("It is null ?", tested, nullValue()); // this check always check that value is null
    }

    @Test
    public void _NotNull() {
        String tested = "";
        assertThat("Is is null or not", tested, notNullValue()); // this check always check that value is not null
    }

    @Test
    public void _EqualTo() {
        String tested = "equals";
        String check = "equals";
        assertThat("Are they equal ?", tested, equalTo(check)); // this check always check that value equal to provided one
        assertThat("Are they equal ?", tested, is(check));
    }

    @Test
    public void _NotEquals() {
        String tested = "separate";
        String check = "equals";
        assertThat("They are not equal", tested, not(check)); // this check always check that value is not equal to provided one
    }

    @Test
    public void _Same() {
        String s1 = "shubham";
        String s2 = s1;
        String s3 = "nigam";
        assertThat("is Same instance ?", s1, sameInstance(s2));
        assertThat("is Same instance ?", s1, sameInstance(s3));
    }

    @Test
    public void _ContainsString() {
        String tested = "hello matcher logic";
        String check = "matcher";
        assertThat("Does it contain a string ?", tested, containsString(check));// this check will find that main string contains some provided string
    }

    @Test
    public void _StartsWith() {
        String tested = "hello matcher logic";
        String check = "hello";
        assertThat("Starts with  ?", tested, startsWith(check));// this check will find that main string starts with provided string
    }

    @Test
    public void _EndsWith() {
        String tested = "hello matcher logic";
        String check = "logic";
        assertThat("Ends with ?", tested, endsWith(check));// this check will find that main string ends with provided string
    }
}
