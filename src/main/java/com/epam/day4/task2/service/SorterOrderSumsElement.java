package com.epam.day4.task2.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SorterOrderSumsElement {
    Logger Logger= LogManager.getLogger();
    int[] sumArray;
    Swapper swapper=new Swapper();
    public void sortAscendingOrder(int[][] array) {
        swapper.swapAscending(countRowSums(array),array);
        Logger.info("Ordered in ascending order of the sums of the elements of the rows of the matrix");
    }

    public void sortDescendingOrder(int[][] array) {
        swapper.swapDescending(countRowSums(array),array);
        Logger.info("Ordered in descending order of the sums of the elements of the rows of the matrix");
    }

    private int[] countRowSums(int[][] array) {
        sumArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j : array[i]) {
                sumArray[i] += j;
            }
        }
        return sumArray;
    }
}
