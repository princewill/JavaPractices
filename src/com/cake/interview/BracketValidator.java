package com.cake.interview;

import java.util.ArrayDeque;
import java.util.Deque;

public class BracketValidator {


    public static boolean isValid(String code) {

        boolean openChar;
        Deque<Character> mostRecentChar = new ArrayDeque<>();

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
