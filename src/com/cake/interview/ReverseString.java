package com.cake.interview;

public class ReverseString {

    public static void reverse(char[] arrayOfChars) {

        int headIndex = 0;
        int tailIndex = arrayOfChars.length - 1;

        while (headIndex < tailIndex) {

            // swap characters
            char temp = arrayOfChars[headIndex];
            arrayOfChars[headIndex] = arrayOfChars[tailIndex];
            arrayOfChars[tailIndex] = temp;

            // move towards middle
            headIndex++;
            tailIndex--;
        }
    }
}
