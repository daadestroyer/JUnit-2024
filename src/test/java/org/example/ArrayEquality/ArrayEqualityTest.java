package org.example.ArrayEquality;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayEqualityTest {

    @Test
    public void a_ArrayObjectEquals() {
        int[] first = {1, 2, 3};
        int[] sameOne = first;
        assertEquals(first, sameOne, () -> "two array objects are equal");
    }

    @Test
    public void b_ArrayObjectNotEquals() {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 3};
        Assertions.assertNotEquals(first, second, () -> "two array objects are not equal");
    }

    @Test
    public void c_ArrayContentEquals() {
        int[] first = {1, 2, 3};
        int[] second = {1, 2, 3};
        Assertions.assertArrayEquals(first, second, () -> "two array content equals");
    }

    @Test
    public void d_ArrayContentNotEquals() {
        int[] first = {1, 2, 3};
        int[] second = {3, 4, 5};
        Assertions.assertArrayEquals(first, second, () -> "two array content are not equal");
    }

    @Test
    public void e_ArraySizeNotEqual(){
        int[] first = {1,2,3};
        int[] second = {1,2};
        Assertions.assertArrayEquals(first,second,()->"Size of two array are not equal");
    }





}
