package com.company;

public class binarySearch {
    public static int binarySearch(int[] elements, int target) {
        int max = elements[elements.length - 1];
        int min = elements[0];
        int tarValue = (elements[0] + elements[elements.length - 1]) / 2;
        int tarInd = 0;
        for (int i = 0; i < elements.length; i++) {
            if (tarValue > target) {
                max = tarValue;
                tarValue = (min + max) / 2;
            }
            if (tarValue < target) {
                min = tarValue;
                tarValue = (min + max) / 2;
            }
            if (elements[i] == tarValue && tarValue == target) {
                tarInd = i;
            }
            else if(elements[i]!=tarValue && tarValue==target){
                tarInd =-1;
            }

        }
        return tarInd;
    }
}
