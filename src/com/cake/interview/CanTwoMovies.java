package com.cake.interview;

import java.util.HashSet;
import java.util.Set;

public class CanTwoMovies {

    public static boolean canTwoMoviesFillFlight(int[] movieLengths, int flightLength) {

        Set<Integer> set = new HashSet<>();

        for(int movieLength : movieLengths){

            int secondMovieLength = flightLength - movieLength;

            if (set.contains(secondMovieLength)) return true;
            else set.add(movieLength);

        }
        return false;
    }
}
