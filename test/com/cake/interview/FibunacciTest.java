package com.cake.interview;


import org.junit.jupiter.api.Test;

import static com.cake.interview.Fibunacci.getFibRecurrsion;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibunacciTest {

    @Test
    public void zerothFibonacciTest() {
        final int actual = getFibRecurrsion(0);
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void firstFibonacciTest() {
        final int actual = getFibRecurrsion(1);
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void secondFibonacciTest() {
        final int actual = getFibRecurrsion(2);
        final int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void thirdFibonacciTest() {
        final int actual = getFibRecurrsion(3);
        final int expected = 2;
        assertEquals(expected, actual);
    }

    @Test
    public void fifthFibonacciTest() {
        final int actual = getFibRecurrsion(5);
        final int expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void tenthFibonacciTest() {
        final int actual = getFibRecurrsion(10);
        final int expected = 55;
        assertEquals(expected, actual);
    }

}
