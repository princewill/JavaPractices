package com.cake.interview;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static com.cake.interview.BracketValidator.isValid;

class BracketValidatorTest {
    @Test
    void validShortCodeTest() {
        final boolean result = isValid("()");
        assertTrue(result);
    }

    @Test
    void validLongerCodeTest() {
        final boolean result = isValid("([]{[]})[]{{}()}");
        assertTrue(result);
    }

    @Test
    void mismatchedOpenerAndCloserTest() {
        final boolean result = isValid("([][]}");
        assertFalse(result);
    }

    @Test
    void interleavedOpenersAndClosersTest() {
        final boolean result = isValid("([)]");
        assertFalse(result);
    }

    @Test
    void missingCloserTest() {
        final boolean result = isValid("[[]()");
        assertFalse(result);
    }

    @Test
    void extraCloserTest() {
        final boolean result = isValid("[[]]())");
        assertFalse(result);
    }

    @Test
    void emptyStringTest() {
        final boolean result = isValid("");
        assertTrue(result);
    }

}