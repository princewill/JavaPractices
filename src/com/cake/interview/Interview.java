package com.cake.interview;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static com.cake.interview.BracketValidator.isValid;
import static com.cake.interview.CanTwoMovies.canTwoMoviesFillFlight;
import static com.cake.interview.InPlaceShuffle.shuffle;
import static com.cake.interview.MaxProfit.getMaxProfit;
import static com.cake.interview.SortScores.sortScores;
import static com.cake.interview.Meeting.mergeRanges;
import static com.cake.interview.MergeArrays.mergeArrays;
import static com.cake.interview.FirstComeFirstServed.isFirstComeFirstServed;



public class Interview {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);

        bracketValidationExamples();
        maxProfitExamples();
        sortScoresExamples();
        mergeRangesSamples();
        mergeArraysSamples();
        fifoSamples();
        canTwoMoviesSamples();
        inPlaceShuffle();
    }

    private static void bracketValidationExamples() {
        System.out.println("Start BracketValidation Program Examples");

        System.out.println("Sample 1: ([]{[]})[]{{}()} = " + isValid("([]{[]})[]{{}()}"));
        System.out.println("Sample 2: ([][]} = " + isValid("([][]}"));
        System.out.println("Sample 3: [[]]()) = " + isValid("[[]]())"));

        System.out.println("End Program____________________________________\n\n");

    }

    private static void maxProfitExamples() {
        System.out.println("Start Max Profit Program Examples");

        System.out.println("Sample 1: {1, 6, 7, 9} = " + getMaxProfit(new int[] {1, 6, 7, 9}));
        System.out.println("Sample 2: {9, 7, 4, 1} = " + getMaxProfit(new int[] {9, 7, 4, 1}));
        System.out.println("Sample 3: {1, 1, 1, 1} = " + getMaxProfit(new int[] {1, 1, 1, 1}));

        System.out.println("End Program____________________________________\n\n");

    }

    private static void sortScoresExamples() {
        final int[] scores = {53};
        final int[] scores1 = {37, 89, 41, 65, 91, 53};
        final int[] scores2 = {20, 10, 30, 30, 10, 20};

        System.out.println("Start sort scores Program Examples");

        System.out.println("Sample 1: unsorted: {55} highestPossibleSCore: 100 ==> " + Arrays.toString(sortScores(scores, 100)));
        System.out.println("Sample 1: unsorted: {37, 89, 41, 65, 91, 53} highestPossibleSCore: 100 ==> " + Arrays.toString(sortScores(scores1, 100)));
        System.out.println("Sample 1: unsorted: {20, 10, 30, 30, 10, 20} highestPossibleSCore: 100 ==> " + Arrays.toString(sortScores(scores2, 100)));

        System.out.println("End Program____________________________________\n\n");

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

        System.out.println("End Program____________________________________\n\n");

    }

    private static void mergeArraysSamples() {

        System.out.println("Start sort merge arrays Program Examples");

        final int[] myArray = {};
        final int[] alicesArray = {};
        System.out.println("Sample 1: array 1: {}, array 2: {} = " + Arrays.toString(mergeArrays(myArray, alicesArray)));

        final int[] myArray1 = {2, 4, 6, 8};
        final int[] alicesArray1 = {1, 7};
        System.out.println("Sample 2: array 1: {2, 4, 6, 8}, array 2: {1, 7} = " + Arrays.toString(mergeArrays(myArray1, alicesArray1)));

        final int[] myArray2 = {2, 4, 6};
        final int[] alicesArray2 = {1, 3, 7};
        System.out.println("Sample 2: array 1: {2, 4, 6}, array 2: {1, 3, 7} = " + Arrays.toString(mergeArrays(myArray2, alicesArray2)));

        System.out.println("End Program____________________________________\n\n");

    }

    private static void fifoSamples() {

        System.out.println("Start FIFO Program Examples");

        final int[] takeOutOrders = {1, 4, 5};
        final int[] dineInOrders = {2, 3, 6};
        final int[] servedOrders = {1, 2, 3, 4, 5, 6};
        System.out.println("Sample 1: takeOutOrders = {1, 4, 5}, dineInOrders = {2, 3, 6}, servedOrders = {1, 2, 3, 4, 5, 6} = " + isFirstComeFirstServed(takeOutOrders, dineInOrders, servedOrders));

        final int[] takeOutOrders1 = {1, 5};
        final int[] dineInOrders1 = {2, 3, 6};
        final int[] servedOrders1 = {1, 2, 3, 5, 6, 8};
        System.out.println("Sample 2: takeOutOrders = {1, 5}, dineInOrders = {2, 3, 6}, servedOrders = {1, 2, 3, 5, 6, 8} = " + isFirstComeFirstServed(takeOutOrders1, dineInOrders1, servedOrders1));

        final int[] takeOutOrders2 = {55, 9};
        final int[] dineInOrders2 = {7, 8};
        final int[] servedOrders2 = {1, 7, 8, 9};
        System.out.println("Sample 2: takeOutOrders2 = {55, 9}, dineInOrders2 = {7, 8}, servedOrders2 = {1, 7, 8, 9} = " + isFirstComeFirstServed(takeOutOrders2, dineInOrders2, servedOrders2));

        System.out.println("End Program____________________________________\n\n");

    }

    private static void canTwoMoviesSamples() {
        System.out.println("Start can two movies fill flight time Program Examples");

        System.out.println("Sample 1: movie lengths: {2, 4} flight length: 1 = " + canTwoMoviesFillFlight(new int[] {2, 4}, 1));
        
        System.out.println("Sample 2: movie lengths: {1, 2, 3, 4, 5, 6} flight length: 7 = " + canTwoMoviesFillFlight(new int[] {1, 2, 3, 4, 5, 6}, 7));

        System.out.println("End Program____________________________________\n\n");

    }

    private static void inPlaceShuffle() {
        final int[] initial = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int[] shuffled = Arrays.copyOf(initial, initial.length);
        shuffle(shuffled);
        System.out.printf("initial array: %s\n", Arrays.toString(initial));
        System.out.printf("shuffled array: %s\n", Arrays.toString(shuffled));
    }


}
