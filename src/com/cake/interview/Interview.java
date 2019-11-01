package com.cake.interview;

import static com.cake.interview.BracketValidator.isValid;
import static com.cake.interview.MaxProfit.getMaxProfit;

public class Interview {

    public static void main(String[] args) {

        bracketValidationExamples();
        maxProfitExamples();
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


}
