package com.epam.day4.task1.service;

import com.epam.day4.task1.model.ArrayWrapper;
import java.util.Arrays;

public class Fibonacci {
    public int[] findingFibonacciNumbers(ArrayWrapper arrayWrapper)
    {
        int counter=0;
        int[] resultArray=new int[0];
        int[] array=arrayWrapper.getArray();
        int arrayLength=array.length;
        for (int i=0;i<arrayLength;i++) {
            if(Math.sqrt(5*Math.pow(array[i],2)+4)%1==0 || Math.sqrt(5*Math.pow(array[i],2)-4)%1==0) {
                resultArray= Arrays.copyOf(resultArray,resultArray.length+1);
                resultArray[counter]=array[i];
                counter++;
            }
        }
        return resultArray;
    }
}
