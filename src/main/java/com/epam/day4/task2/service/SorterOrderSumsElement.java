package com.epam.day4.task2.service;

public class SorterOrderSumsElement {
    int[] sumArray;
    Swapper swapper=new Swapper();
    public void sortAscendingOrder(int[][] array) {
        swapper.swapAscending(countRowSums(array),array);
    }

    public void sortDescendingOrder(int[][] array) {
        swapper.swapDescending(countRowSums(array),array);
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
