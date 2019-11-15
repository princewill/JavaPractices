package com.cake.interview;

public class MergeArrays {

    public static int[] mergeArrays(int[] myArray, int[] alicesArray) {
        int [] sortedList = new int[myArray.length + alicesArray.length];
        int myArrayIndex = 0;
        int alicesArrayIndex = 0;
        int sortedArrayLength = sortedList.length;

        if(myArray.length == 0) return alicesArray;
        else if(alicesArray.length == 0) return myArray;

        for (int i = 0; i <  sortedArrayLength; ++i) {
            boolean isFinishedMyArray = myArrayIndex >= myArray.length;
            boolean isFinishedAlicesArray = alicesArrayIndex >= alicesArray.length;

            if (!isFinishedMyArray && !isFinishedAlicesArray) {
                if (myArray[myArrayIndex] > alicesArray[alicesArrayIndex]) {
                    sortedList[i] = alicesArray[alicesArrayIndex];
                    alicesArrayIndex++;
                }
                else {
                    sortedList[i] = myArray[myArrayIndex];
                    myArrayIndex++;
                }
            }
            else if (isFinishedMyArray && !isFinishedAlicesArray) {
                sortedList[i] = alicesArray[alicesArrayIndex];
                alicesArrayIndex++;
            }
            else  {
                sortedList[i] = myArray[myArrayIndex];
                myArrayIndex++;
            }
        }

        return sortedList;
    }
}
