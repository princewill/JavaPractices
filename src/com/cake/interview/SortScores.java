package com.cake.interview;


public class SortScores {

    public static int[] sortScores(int[] unorderedScores, int highestPossibleScore) {

        int[] scoresCount = new int[highestPossibleScore + 1];
        int[] sorted = new int[unorderedScores.length];
        int indexForSortedArray = 0;

        for (int score : unorderedScores) scoresCount[score]++;

        for(int i = highestPossibleScore; i >= 0; i-- ) {

            for(int j = 0; j < scoresCount[i]; j++){
                sorted[indexForSortedArray] = i;
                indexForSortedArray++;
            }
        }

        return sorted;
    }
}
