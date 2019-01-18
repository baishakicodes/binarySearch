package com.company;

public class bubbleSort {
    public static void bubbleSortII(int[] arr){
        //*the first for loop is for the out iteration
        for(int i =0; i<arr.length; i++){
            //*the second for loop is for the actual swapping in the first outer iteration
            //*the precondition j<arr.length-1 is so that we don't keep on going to the end of the array that is already sorted
            for(int j=1; j<arr.length-i; j++){
                if(arr[j-1]>arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
