package com.epam.day4.task1.service;

import com.epam.day4.task1.model.Array;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FibonacciTest {
    Array array;
    Fibonacci fibonacci;

    @BeforeMethod
    public void setUp() {
        array =new Array(new int[]{1,2,46,72,7,26,3451,5,62,3,5,6,7,8});
        fibonacci=new Fibonacci();
    }

    @Test
    public void testFindingFibonacciNumbers() {
        int[] actual={1,2,5,3,5,8};
        int[] expected=fibonacci.findingFibonacciNumbers(array);
        Assert.assertEquals(actual,expected);
    }
}