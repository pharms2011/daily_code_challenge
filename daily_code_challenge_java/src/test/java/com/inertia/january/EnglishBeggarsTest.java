package com.inertia.january;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import org.junit.runners.JUnit4;

public class EnglishBeggarsTest {

    @Test
    public void tester() throws Exception {
        // not my fault, but grouping tests in Java using `describe` is completely messed up
        // https://www.codewars.com/docs/java-test-reference
        // if can group, then do group these into basic and random tests

        // Basic tests
        int[] test = {1, 2, 3, 4, 5};
        int[] a1 = {15}, a2 = {9, 6}, a3 = {5, 7, 3}, a4 = {1, 2, 3, 4, 5, 0}, a5 = {};
        assertArrayEquals(a1, EnglishBeggars.beggars(test, 1));
        assertArrayEquals(a2, EnglishBeggars.beggars(test, 2));
        assertArrayEquals(a3, EnglishBeggars.beggars(test, 3));
        assertArrayEquals(a4, EnglishBeggars.beggars(test, 6));
        assertArrayEquals(a5, EnglishBeggars.beggars(test, 0));
    }
}
