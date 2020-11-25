package com.epam.day4.task1.service;

import com.epam.day4.task1.model.Array;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PrimeNumbersTest {
    PrimeNumbers primeNumbers;
    Array array;
    @BeforeMethod
    public void setUp() {
        primeNumbers=new PrimeNumbers();
        array =new Array(new int[]{1,2,3,4,5,6,7,8,9,10});
    }

    @Test
    public void testFindPrimeNumbers() {
        int[] actual=primeNumbers.findPrimeNumbers(array);
        int[] expected={1,2,3,5,7};
        Assert.assertEquals(actual,expected);
    }
}