package org.example.AssertThatCombination;

import org.hamcrest.MatcherAssert;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AsserThatCombinationTest {

    // in AllOf all these check should pass
    @Test
    public void _allOf() {
        String tested = "(side bar) !";
        assertThat("Many criteria", tested, allOf(
                startsWith("("), containsString("bar"), endsWith("!")
        ));
    }

    // in anyOf any one check should pass
    @Test
    public void _anyOf() {
        String tested = "this is shubham nigam";
        assertThat("Many Criteria", tested, anyOf(
                containsString("is"),
                containsString("hello"),
                containsString("by")
        ));
    }

    // in this check we are avoiding all these symbols
    @Test
    public void _combination() {
        String tested = "my name is shubham works in Genpact as Java backend developer";
        assertThat("Two Check Should Pass", tested, not(anyOf(
                containsString("!"),
                containsString("@"),
                containsString("#"),
                containsString(","),
                containsString(".")
        )));
    }

    @Test
    public void _Either() {
        String tested = "(side bar) !";
        assertThat("Either",
                either(endsWith("!")).or(startsWith("(")).and(notNullValue()));

    }
}
