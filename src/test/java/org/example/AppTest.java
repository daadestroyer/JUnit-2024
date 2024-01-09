package org.example;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void test(){
        System.out.println("Testing some assertion methods");
        int actual = 12;
        int expected = 12;
        Assertions.assertEquals(actual,expected);

        int[] actualArray = {10,20,30,40};
        int[] expectedArray = {10,20,30,40};
        Assertions.assertArrayEquals(actualArray,expectedArray);

        String name1 = "shubham";
//        String name2 = "nigam";
        String name2 = "shubham";
        Assertions.assertEquals(name1,name2);
    }
}
