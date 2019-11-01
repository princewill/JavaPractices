package com.cake.interview;

public class MaxProfit {

    public static int getMaxProfit(int[] stockPrices) {
        int potentialProf;
        int buy = stockPrices[0];
        int maxProf = stockPrices[1] - stockPrices[0];

        for (int i = 1; i < stockPrices.length; i++) {
            potentialProf = stockPrices[i] - buy;

            if (maxProf < potentialProf) maxProf = potentialProf;

            if(stockPrices[i] < buy) buy = stockPrices[i];


        }
        return maxProf;
    }
}
