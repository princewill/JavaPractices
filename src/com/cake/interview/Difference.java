package com.cake.interview;


class Difference {
    private int[] elements;
    int maximumDifference;

    Difference(int[] arr) { this.elements = arr; }

    void computeDifference() {
        int max = 0;
        for(int i = 0; i < elements.length; i++){
            for(int j = i; j < elements.length; j++){
                int temp = Math.abs(elements[i] - elements[j]);
                if(temp > max) max = temp;
            }
        }

        maximumDifference = max;

    }

} // End of Difference class

