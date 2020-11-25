package com.epam.day4.task2.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SorterOrderMaximumElements {
    Logger Logger= LogManager.getLogger();
    int[] maxArray;
    Swapper swapper=new Swapper();

    public void sortDescendingOrderMaximumElements(int[][] array) {
        swapper.swapDescending(countMaxArray(array),array);
        Logger.info("Ordered in descending order of maximum elements of matrix rows;\n");
    }

    public void sortAscendingOrderMaximumElements(int[][] array) {
        swapper.swapAscending(countMaxArray(array),array);
        Logger.info("Ordered in ascending order of maximum elements of matrix rows;\n");
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
