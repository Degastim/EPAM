package com.epam.day4.task1.main;

import com.epam.day4.task1.model.ArrayWrapper;
import com.epam.day4.task1.service.Aggregate;
import com.epam.day4.task1.service.Fibonacci;
import com.epam.day4.task1.service.PrimeNumbers;

public class Main {
    public static void main(String[] args) {
        ArrayWrapper array=new ArrayWrapper(new int[]{1,2,3,4,5,6,8,9,10});
        PrimeNumbers primeNumbers=new PrimeNumbers();
        int[] array1=primeNumbers.findPrimeNumbers(array);
        for (int i=0;i<array1.length;i++)
        {
            System.out.println(array1[i]);
        }

    }
}