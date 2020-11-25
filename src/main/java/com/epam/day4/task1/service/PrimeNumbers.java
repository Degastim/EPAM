package com.epam.day4.task1.service;

import com.epam.day4.task1.model.Array;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class PrimeNumbers {
    private Logger Logger=LogManager.getLogger();

    public int[] findPrimeNumbers(Array arrayWrapper) {
        int counter=0;
        int[] resultArray=new int[0];
        int[] array=arrayWrapper.getArray();
        boolean NotPrimeNumber=true;
        for (int i:array) {
            for(int j=2;j<=i/2;j++) {
                if(i%j==0) {
                    NotPrimeNumber=false;
                }
            }
            if(NotPrimeNumber) {
                resultArray= Arrays.copyOf(resultArray,resultArray.length+1);
                resultArray[counter]=i;
                counter++;
            }
            NotPrimeNumber=true;
        }
        Logger.info("Found prime numbers in array");
        return resultArray;
    }
}
