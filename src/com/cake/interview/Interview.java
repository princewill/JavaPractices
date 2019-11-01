package com.cake.interview;

import static com.cake.interview.BracketValidator.isValid;

public class Interview {

    public static void main(String[] args) {

        bracketValidationExamples();
    }

    private static void bracketValidationExamples() {
        System.out.println("Start BracketValidation Program Examples");

        System.out.println("Sample 1: ([]{[]})[]{{}()} = " + isValid("([]{[]})[]{{}()}"));
        System.out.println("Sample 2: ([][]} = " + isValid("([][]}"));
        System.out.println("Sample 3: [[]]()) = " + isValid("[[]]())"));

        System.out.println("End Program____________________________________");

    }


}
