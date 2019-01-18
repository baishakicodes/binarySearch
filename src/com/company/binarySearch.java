package com.company;

public class binarySearch {

    public static int binarySearch(int[] elements, int target) {
        bubbleSort.bubbleSortII(elements);
        int max =elements.length-1;
        int min = 0;
        for (int i = (min+max)/2; min<=max;i=(min+max)/2 ) {
            if (elements[i] == target) {
                return i;
            } else if (elements[i] > target) {
                max = i - 1;
            } else if (elements[i] < target) {
                min = i + 1;
            }
        }
        return -1;
    }
    public static int binarySearch2(int[] elements, int target){
        bubbleSort.bubbleSortII(elements);
        int max =elements.length-1;
        int min = 0;
        int guess = (min+max)/2;
        boolean checker = true;
        while(min<=max){
            if(elements[guess]==target){
                return guess;
            }
            else if(elements[guess]>target){
                max = guess-1;
                guess = (min+max)/2;
            }
            else if(elements[guess]<target){
                min=guess+1;
                guess=(min+max)/2;
            }
        }
        return -1;
    }

}
