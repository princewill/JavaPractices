package com.cake.interview;

import java.util.Arrays;

import static com.cake.interview.BracketValidator.isValid;
import static com.cake.interview.MaxProfit.getMaxProfit;
import static com.cake.interview.SortScores.sortScores;

public class Interview {

    public static void main(String[] args) {

        bracketValidationExamples();
        maxProfitExamples();
        sortScoresExamples();
    }

    private static void bracketValidationExamples() {
        System.out.println("Start BracketValidation Program Examples");

        System.out.println("Sample 1: ([]{[]})[]{{}()} = " + isValid("([]{[]})[]{{}()}"));
        System.out.println("Sample 2: ([][]} = " + isValid("([][]}"));
        System.out.println("Sample 3: [[]]()) = " + isValid("[[]]())"));

        System.out.println("End Program____________________________________");

    }

    private static void maxProfitExamples() {
        System.out.println("Start Max Profit Program Examples");

        System.out.println("Sample 1: {1, 6, 7, 9} = " + getMaxProfit(new int[] {1, 6, 7, 9}));
        System.out.println("Sample 2: {9, 7, 4, 1} = " + getMaxProfit(new int[] {9, 7, 4, 1}));
        System.out.println("Sample 3: {1, 1, 1, 1} = " + getMaxProfit(new int[] {1, 1, 1, 1}));

        System.out.println("End Program____________________________________");

    }

    private static void sortScoresExamples() {
        final int[] scores = {53};
        final int[] scores1 = {37, 89, 41, 65, 91, 53};
        final int[] scores2 = {20, 10, 30, 30, 10, 20};

        System.out.println("Start sort scores Program Examples");

        System.out.println("Sample 1: unsorted: {55} highestPossibleSCore: 100 ==> " + Arrays.toString(sortScores(scores, 100)));
        System.out.println("Sample 1: unsorted: {37, 89, 41, 65, 91, 53} highestPossibleSCore: 100 ==> " + Arrays.toString(sortScores(scores1, 100)));
        System.out.println("Sample 1: unsorted: {20, 10, 30, 30, 10, 20} highestPossibleSCore: 100 ==> " + Arrays.toString(sortScores(scores2, 100)));

        System.out.println("End Program____________________________________");

    }


}
