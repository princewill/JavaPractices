package com.cake.bracketvalidator;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayDeque;
import java.util.Deque;

public class BracketValidator {
    public static void main(String[] args) {
      System.out.println("Sample 1: ([]{[]})[]{{}()} = " + isValid("([]{[]})[]{{}()}"));
      System.out.println("Sample 2: ([][]} = " + isValid("([][]}"));
      System.out.println("Sample 3: [[]]()) = " + isValid("[[]]())"));
    }


    public static boolean isValid(String code) {

        boolean openChar;
        Deque<Character> mostRecentChar = new ArrayDeque<Character>();

        // determine if the input code is valid
        for(char c : code.toCharArray()) {
            openChar = c == '(' || c == '[' || c == '{';

            if(!openChar && (mostRecentChar.isEmpty() || c != mostRecentChar.getFirst())) return false;

            switch(c){
                case '[': mostRecentChar.push(']'); break;
                case '{': mostRecentChar.push('}'); break;
                case '(': mostRecentChar.push(')'); break;
                default: mostRecentChar.pop();
            }
        }

        return mostRecentChar.isEmpty();
    }

}
