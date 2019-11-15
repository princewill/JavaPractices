package com.cake.interview;

public class FirstComeFirstServed {

    public static boolean isFirstComeFirstServed(int[] takeOutOrders, int[] dineInOrders, int[] servedOrders) {
        int takeOutOrdersIndex = 0;
        int dineInOrdersIndex = 0;
        boolean isFIFOServed = true;



        for(int order : servedOrders) {
            if(takeOutOrdersIndex < takeOutOrders.length && order == takeOutOrders[takeOutOrdersIndex]) {
                takeOutOrdersIndex++;
            }
            else if (dineInOrdersIndex < dineInOrders.length && order == dineInOrders[dineInOrdersIndex]) {
                dineInOrdersIndex++;
            }
            else isFIFOServed = false;
        }

        if (dineInOrdersIndex != dineInOrders.length || takeOutOrdersIndex != takeOutOrders.length) isFIFOServed = false;

        return isFIFOServed;
    }
}
