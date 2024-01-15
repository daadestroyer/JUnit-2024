package org.example.AssertCollections;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class AssertCollectionsTest {

    @Test
    public void CollectionContains() {
        String[] testArray = {"a", "b", "c", "d", "e"};
        List<String> tested = Arrays.asList(testArray);
        assertThat("Is the item contained ? ", tested, hasItem("c"));
    }

    @Test
    public void _CollectionSearch() {
        String[] testArray = {"dog", "car", "rat", "tiger", "mouse", "unicorn", "uni"};
        List<String> tested = Arrays.asList(testArray);
        assertThat("All items meets the criteria", tested, hasItem("uni"));
    }

    @Test
    public void _CollectionFilter() {
        String[] testArray = {"dog", "car", "rat", "tiger", "mouse", "unicorn", "uni"};
        List<String> tested = Arrays.asList(testArray);
        assertThat("All items meet the criteria", tested, everyItem(not(endsWith("fish"))));
    }
}
