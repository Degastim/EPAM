package com.epam.day4.task1.service;

import com.epam.day4.task1.model.Array;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sorter {
    private Logger Logger= LogManager.getLogger();

    public void bubbleSort(Array arrayWrapper) {
        int[] array=arrayWrapper.getArray();
        int arrayLength=array.length;
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arrayLength - 1; i++) {
                if (array[i] > array[i+1]) {
                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    sorted = false;
                }
            }
        }
        Logger.info("Bubble sort performed");
    }

    public void insertionSort(Array arrayWrapper) {
        int[] array=arrayWrapper.getArray();
        int arrayLength=array.length;
        for (int i = 1; i < arrayLength; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }
        Logger.info("Insertion Sort performed");
    }

    public void selectionSort(Array arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int arrayLength = array.length;
        for (int i = 0; i < arrayLength; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i + 1; j < arrayLength; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
        Logger.info("Selection Sort performed");
    }
}
