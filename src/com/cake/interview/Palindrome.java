package com.cake.interview;

import java.util.HashSet;
import java.util.Set;

public class Palindrome {

    public static boolean hasPalindromePermutation(String theString) {

        Set<Character> set = new HashSet<>();
        for (char stringChar : theString.toCharArray()) {

            if (set.contains(stringChar)){
                set.remove(stringChar);
            }
            else set.add(stringChar);
        }

        return set.size() <= 1;
    }
}
