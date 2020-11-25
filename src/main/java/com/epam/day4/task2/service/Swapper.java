package com.epam.day4.task2.service;

public class Swapper {

    private boolean RowsSwap(int[] additionalArray ,int[][] array,int i)
    {
        int[] temp;
        int buffer;
        temp = array[i];
        array[i] = array[i + 1];
        array[i + 1] = temp;
        buffer = additionalArray[i];
        additionalArray[i] = additionalArray[i + 1];
        additionalArray[i + 1] = buffer;
        return false;
    }

    public void swapDescending(int[] additionalArray,int[][] array)
    {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (additionalArray[i] < additionalArray[i + 1]) {
                    sorted=RowsSwap(additionalArray,array,i);
                }
            }
        }
    }
    public void swapAscending(int[] additionalArray,int[][] array)
    {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (additionalArray[i] > additionalArray[i + 1]) {
                    sorted=RowsSwap(additionalArray,array,i);
                }
            }
        }
    }
}
