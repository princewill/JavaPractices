package com.cake.interview;

import static com.cake.interview.ReverseString.reverseString;

public class ReverseWord {

    public static void reverseWord(char[] message){

        reverseString(message, 0, message.length - 1);

        int startingIndex = 0;

        for(int i = 0; i <= message.length; i++) {
            if (i == message.length || message[i] == ' ') {
                reverseString(message, startingIndex, i - 1);
                startingIndex = i + 1;
            }
        }

    }



}
