package com.cake.interview;

public class Fibunacci {

    static int getFibRecurrsion(int n){

        if(n <= 1) return n;

        return getFibRecurrsion(n - 1) + getFibRecurrsion(n - 2);
    }

    static int getFibIteration(int n) {

        if(n <= 1) return n;

        int prevprev = 0;
        int prev = 1;
        int current = 0;

        for(int i = 2; i < n; i++){

            current = prevprev + prev;
            prevprev = prev;
            prev = current;
        }

        return current;
    }
}
