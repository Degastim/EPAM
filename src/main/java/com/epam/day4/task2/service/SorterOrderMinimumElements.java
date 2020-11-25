package com.epam.day4.task2.service;

public class SorterOrderMinimumElements {
    int[] minArray;
    Swapper swapper=new Swapper();
    public void sortDescendingOrderMinimumElements(int[][] array) {
        swapper.swapDescending(countMinArray(array),array);
    }

    public void sortAscendingOrderMinimumElements(int[][] array) {
        swapper.swapAscending(countMinArray(array),array);
    }

    private int[] countMinArray(int[][] array) {
        int arrayLength=array.length;
        minArray=new int[arrayLength];
        for(int i=0;i<arrayLength;i++) {
            minArray[i]=Integer.MAX_VALUE;
            for(int j:array[i]) {
                if(minArray[i]>j) {
                    minArray[i]=j;
                }
            }
        }
        return  minArray;
    }
}
