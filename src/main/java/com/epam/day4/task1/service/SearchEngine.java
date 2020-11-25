package com.epam.day4.task1.service;

import com.epam.day4.task1.model.Array;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class SearchEngine {
    private Logger Logger= LogManager.getLogger();

    public int searchMaxNumber(Array arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int maxNumber = Integer.MIN_VALUE;
        for (int i : array) {
            if (i > maxNumber) {
                maxNumber = i;
            }
        }
        Logger.info("Found max number in array");
        return maxNumber;
    }

    public int searchMinNumber(Array arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int minNumber = Integer.MAX_VALUE;
        for (int i : array) {
            if (i < minNumber) {
                minNumber = i;
            }
        }
        Logger.info("Found min number in array");
        return minNumber;
    }

    public int[] searchThreeDigitNumbersWithoutRepetitions(Array arrayWrapper) {
        int[] array = arrayWrapper.getArray();
        int[] resultArray = new int[0];
        int counter = 0;
        for (int i : array) {
            if (i > 99 && i < 1000) {
                int thirdDigit = i % 10;
                int secondDigit = ((i - thirdDigit) / 10) % 10;
                int firstDigit = i / 100;
                if (thirdDigit != secondDigit && secondDigit != firstDigit) {
                    resultArray=Arrays.copyOf(resultArray, resultArray.length + 1);
                    resultArray[counter] = i;
                    counter++;
                }
            }
        }
        Logger.info("Found all three-digit numbers that do not have the same decimal notation");
        return resultArray;
    }

    public int binarySearch(Array arrayWrapper, int searchValue) {
        int[] array=arrayWrapper.getArray();
        int arrayLength=array.length;
        int position=(arrayLength-1)/2;
        int last=arrayLength-1;
        int first=0;
        while ((array[position] != searchValue)) {
            if (array[position] > searchValue) {
                last = position - 1;
            } else {
                first = position + 1;    
            }
            position = (first + last) / 2;
        }
        Logger.info("Performed binary search for number" + searchValue);
        return position;
    }
}


