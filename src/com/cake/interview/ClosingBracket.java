package com.cake.interview;

public class ClosingBracket {
    public static int getClosingParen(String sentence, int openingParenIndex) {
        int closingCount = 1;

        for(int i = openingParenIndex + 1; i<sentence.length(); i++) {
            char c = sentence.charAt(i);

            if (c == '('){
                closingCount++;
            }
            else if(c ==')'){
                closingCount--;
                if(closingCount == 0){
                    return i;
                }
            }
        }


        throw new IllegalArgumentException("No closing parenthesis :(");
    }
}
