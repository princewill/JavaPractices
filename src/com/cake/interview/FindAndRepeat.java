package com.cake.interview;

public class FindAndRepeat {

    public static int findRepeat(int[] numbers) {

        int floor = 1;
        int ceiling = numbers.length - 1;

        while (floor < ceiling) {


            int midpoint = floor + ((ceiling - floor) / 2);
            int lowerRangeFloor   = floor;
            int lowerRangeCeiling = midpoint;
            int upperRangeFloor   = midpoint + 1;
            int upperRangeCeiling = ceiling;

            int itemsInLowerRange = 0;
            for (int item : numbers) {

                if (item >= lowerRangeFloor && item <= lowerRangeCeiling) {
                    itemsInLowerRange += 1;
                }
            }

            int distinctPossibleIntegersInLowerRange = lowerRangeCeiling - lowerRangeFloor + 1;

            if (itemsInLowerRange > distinctPossibleIntegersInLowerRange) {
                floor   = lowerRangeFloor;
                ceiling = lowerRangeCeiling;
            } else {
                floor   = upperRangeFloor;
                ceiling = upperRangeCeiling;
            }
        }

        return floor;
    }
}
