package com.cake.interview;

public class ReverseString {

    public static void reverseString(char[] arrayOfChars, int headIndex, int tailIndex) {

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
