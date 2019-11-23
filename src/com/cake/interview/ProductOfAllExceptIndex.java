package com.cake.interview;

public class ProductOfAllExceptIndex {

    public static int[] getProductsOfAllIntsExceptAtIndex(int[] intArray) {

        if (intArray.length < 2) {
            throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
        }

        int[] intArrayProduct = new int[intArray.length];


        int productBeforeIndex = 1;

        for(int o = 0; o < intArray.length; ++o) {
            intArrayProduct[o] = productBeforeIndex;
            productBeforeIndex *= intArray[o];
        }

        productBeforeIndex = 1;

        for(int i = intArray.length - 1; i >= 0; --i){
            intArrayProduct[i] *= productBeforeIndex;
            productBeforeIndex *= intArray[i];
        }


        return intArrayProduct;
    }
}
