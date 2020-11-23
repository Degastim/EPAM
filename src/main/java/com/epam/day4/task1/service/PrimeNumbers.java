package com.epam.day4.task1.service;

import com.epam.day4.task1.model.ArrayWrapper;

import java.util.Arrays;


public class PrimeNumbers {
    public int[] findPrimeNumbers(ArrayWrapper arrayWrapper)
    {
        int counter=0;
        int[] resultArray=new int[0];
        int[] array=arrayWrapper.getArray();
        int arrayLength=array.length;
        boolean NotPrimeNumber=true;
        for (int i=0;i<arrayLength;i++) {
            for(int j=2;j<=array[i]/2;j++)
            {
                if(array[i]%j==0 || array[i]==1)
                {
                    NotPrimeNumber=false;
                }
            }
            System.out.println(NotPrimeNumber);
            if(NotPrimeNumber)
           {
               resultArray= Arrays.copyOf(resultArray,resultArray.length+1);
               resultArray[counter]=array[i];
               counter++;
           }
            NotPrimeNumber=true;
        }
        return resultArray;
        String
    }
}
