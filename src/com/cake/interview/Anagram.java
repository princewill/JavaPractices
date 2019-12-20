package com.cake.interview;

import java.util.stream.IntStream;

public class Anagram {


    public static boolean isAnagram(String s, String t) {

        if(s.length() != t.length()) return false;

        int[] letters = new int[256];

        char[] s_array = s.toCharArray();

        int num_of_uniqueChar = 0;
        int completed = 0;

        for(char c: s_array){
            if(letters[c] == 0) num_of_uniqueChar++;
            ++letters[c];
        }

        for(int i = 0; i < letters.length; ++i){
            int c = (int) t.charAt(i);
            if(letters[c] == 0) return false;
            --letters[c];
            if(letters[c] == 0) {
                ++completed;
                if(completed == num_of_uniqueChar) return i == t.length() - 1;
            }

        }

        return false;
    }
}
