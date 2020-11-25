package com.epam.day4.task2.service;

public class SorterOrderMaximumElements {
    int[] maxArray;
    Swapper swapper=new Swapper();
    public void sortDescendingOrderMaximumElements(int[][] array) {
        swapper.swapDescending(countMaxArray(array),array);
    }

    public void sortAscendingOrderMaximumElements(int[][] array) {
        swapper.swapAscending(countMaxArray(array),array);
    }

    private int[] countMaxArray(int[][] array) {
        int arrayLength=array.length;
        maxArray=new int[arrayLength];
        for(int i=0;i<arrayLength;i++) {
            maxArray[i]=Integer.MIN_VALUE;
            for(int j:array[i]) {
                if(maxArray[i]<j) {
                    maxArray[i]=j;
                }
            }
        }
        return  maxArray;
    }
}
