package com.cake.interview;

import org.junit.jupiter.api.Test;

import static com.cake.interview.Anagram.isAnagram;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AnagramTest {

    @Test
    public void correctAnagramTest() {
        final boolean actual = isAnagram("howareyou", "uoyerawoh");
        final boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void wrongAnagramTest() {
        final boolean actual = isAnagram("howareyou", "uoyerawo");
        final boolean expected = false;

        assertEquals(expected, actual);
    }

    @Test
    public void correctAnagramWithSpecialCharactersTest() {
        final boolean actual = isAnagram("howareyou??*", "*??uoyerawoh");
        final boolean expected = true;

        assertEquals(expected, actual);
    }

    @Test
    public void anagramWithSpaceTest() {
        final boolean actual = isAnagram("how are you", "uoy era woh");
        final boolean expected = true;

        assertEquals(expected, actual);
    }
}
