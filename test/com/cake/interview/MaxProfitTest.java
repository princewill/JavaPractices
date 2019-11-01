package com.cake.interview;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.cake.interview.MaxProfit.getMaxProfit;
import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {
    @Test
    void priceGoesUpThenDownTest() {
        final int actual = getMaxProfit(new int[] {1, 5, 3, 2});
        final int expected = 4;
        assertEquals(expected, actual);
    }

    @Test
    void priceGoesDownThenUpTest() {
        final int actual = getMaxProfit(new int[] {7, 2, 8, 9});
        final int expected = 7;
        assertEquals(expected, actual);
    }

    @Test
    void priceGoesUpAllDayTest() {
        final int actual = getMaxProfit(new int[] {1, 6, 7, 9});
        final int expected = 8;
        assertEquals(expected, actual);
    }

    @Test
    void priceGoesDownAllDayTest() {
        final int actual = getMaxProfit(new int[] {9, 7, 4, 1});
        final int expected = -2;
        assertEquals(expected, actual);
    }

    @Test
    void priceStaysTheSameAllDayTest() {
        final int actual = getMaxProfit(new int[] {1, 1, 1, 1});
        final int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    void exceptionWithOnePriceTest() {
        Assertions.assertThrows(
                Exception.class,
                () -> {
                    getMaxProfit(new int[]{5});
                }
        );
    }

    @Test
    void exceptionWithEmptyPricesTest() {
        Assertions.assertThrows(
                Exception.class,
                () -> {
                    getMaxProfit(new int[]{});
                }
                );
    }


}