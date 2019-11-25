package com.cake.interview;

public class RotationPoint {

    public static int findRotationPoint(String[] words) {

        final String firstWord = words[0];
        int floor = 0;
        int roof = words.length - 1;

        while (roof >= floor) {
            int guessIndex = floor + ((roof - floor) / 2);

            if(words[guessIndex].compareTo(firstWord) >= 0) {
                floor = guessIndex;
            } else {
                roof = guessIndex;
            }

            if (floor + 1 == roof) {

                break;
            }
        }


        return 0;
    }

}
