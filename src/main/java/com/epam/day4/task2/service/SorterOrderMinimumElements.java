package com.epam.day4.task2.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SorterOrderMinimumElements {
    Logger Logger= LogManager.getLogger();
    int[] minArray;
    Swapper swapper=new Swapper();
    public void sortDescendingOrderMinimumElements(int[][] array) {
        swapper.swapDescending(countMinArray(array),array);
        Logger.info("Ordered in descending order of minimal elements of matrix rows");
    }

    public void sortAscendingOrderMinimumElements(int[][] array) {
        swapper.swapAscending(countMinArray(array),array);
        Logger.info("Ordered in ascending order of minimal elements of matrix rows");
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
