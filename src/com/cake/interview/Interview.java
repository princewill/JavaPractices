package com.cake.interview;

import java.util.Arrays;
import java.util.List;

import static com.cake.interview.BracketValidator.isValid;
import static com.cake.interview.MaxProfit.getMaxProfit;
import static com.cake.interview.SortScores.sortScores;
import static com.cake.interview.Meeting.mergeRanges;



public class Interview {

    public static void main(String[] args) {

        bracketValidationExamples();
        maxProfitExamples();
        sortScoresExamples();
        mergeRangesSamples();
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

    private static void mergeRangesSamples() {

        final List<Meeting> meetings = Arrays.asList(
                new Meeting(0, 1), new Meeting(3, 5), new Meeting(4, 8),
                new Meeting(10, 12), new Meeting(9, 10)
        );
        final List<Meeting> meetings2 = Arrays.asList(
                new Meeting(1, 10), new Meeting(2, 5), new Meeting(6, 8),
                new Meeting(9, 10), new Meeting(10, 12)
        );

        System.out.println("Start sort merge ranges Program Examples");

        System.out.println("Sample 1: unsorted: {(0, 1), (3, 5), (4, 8), (10, 12), (9, 10)} = " + (mergeRanges(meetings)));
        System.out.println("Sample 1: unsorted: {(1, 10), (2, 5), (6, 8), (9, 10), (10, 12} = " + (mergeRanges(meetings2)));

        System.out.println("End Program____________________________________");

    }


}
