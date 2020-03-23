package com.cake.interview;

public class Swap {
    public static void swap(int a, int b) {
        a = b - a; // 9 - 5 = 4
        b = b - a; // 9 - 4 = 5
        a = a + b; // 4 + 5 = 9
    }
}
