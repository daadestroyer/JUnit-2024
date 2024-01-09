package org.example.ObjectEquality;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ObjectEqualityTest {

    @Test
    public void a_StringEquals() {
        String first = "objectEquals";
        String second = "objectEquals";
        String third = "objectNotEquals";
        Assertions.assertEquals(first, second, "Two Strings");
        Assertions.assertEquals(first, third, "Two Strings not Equals");
    }

    @Test
    public void b_ObjectEquals() {
        Sample s1 = new Sample(42, "a");
        Sample s2 = new Sample(42, "a");
        Assertions.assertEquals(s1, s2, "Two Object Comparison(Two Objects should same");
    }

    @Test
    public void c_ObjectEqualsFail() {
        Sample S1 = new Sample(41, "a");
        Sample S2 = new Sample(42, "b");
        Assertions.assertEquals(S1, S2, "Two Object Comparison(Two Objects should same");
    }

    @Test
    public void d_ObjectNotEquals() {
        Sample first = new Sample(41, "a");
        Sample second = new Sample(42, "b");
        Assertions.assertNotEquals(first, second, "Two Object Comparison(Two Objects should not same");
    }

    @Test
    public void e_sameObject() {
        String first = "Hello";
        String second = new String("Hello");
        String third = "Hello new";
        String fourth = "Hello";
        Assertions.assertEquals(first, second, () -> "content should be equal");
        Assertions.assertNotEquals(first, third, () -> "content should not be equal");
        Assertions.assertNotSame(first, second, () -> "Should not the same object");
        Assertions.assertSame(first, fourth, () -> "Check the object are same or not");
    }


    @Test
    public void f_NullObjectFail() {
        String first = "shubham";
        String nullObj = null;
        Assertions.assertEquals(first, nullObj);
    }

    @Test
    public void g_NullObjects() {
        String first = null;
        String second = null;
        Assertions.assertEquals(first, second, "Both are null");
    }

    @Test
    public void h_Null() {
        String check = null;
        Assertions.assertNull(check, "This should be null");
    }

    @Test
    public void i_NotNull() {
        String check = "check";
        Assertions.assertNotNull(check);
    }


}
