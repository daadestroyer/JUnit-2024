package org.example.NumberEquality;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class NumberEqualityTest {

    @Test
    public void a_IntegerEqualAsserts() {
        long longValue = 10;
        Assertions.assertEquals(longValue, longValue);
        Assertions.assertEquals(longValue, longValue, "Two Long Values");

        int shortValue = 10;
        int intValue = 10;

        Assertions.assertEquals(intValue, shortValue, "Any Two Integers");
    }


    @Test
    public void v_FloatingEqualAssets(){
        double doubleFirstValue = 0.3;
        double doubleSecondValue = 0.300001;
        Assertions.assertEquals(doubleFirstValue,doubleFirstValue,"Two Double Values");
        Assertions.assertEquals(doubleFirstValue,doubleSecondValue,0.0001);

        long longValue = 10;
        byte secondValue = 9;
        Assertions.assertEquals(longValue,secondValue,"Integers too");
    }
}
