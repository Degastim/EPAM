package com.epam.day4.task1.service;

import com.epam.day4.task1.model.Array;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SorterTest {
    Array array;
    Sorter sorting;
    @BeforeMethod
    public void setUp() {
        array =new Array(new int[]{1,56,7,25,78,25,792,4,6});
        sorting=new Sorter();
    }

    @Test
    public void testBubbleSort() {
        sorting.bubbleSort(array);
        int[] actual= array.getArray();
        int[] expected={1,4,6,7,25,25,56,78,792};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testInsertionSort() {
        sorting.insertionSort(array);
        int[] actual= array.getArray();
        int[] expected={1,4,6,7,25,25,56,78,792};
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSelectionSort() {
        sorting.selectionSort(array);
        int[] actual= array.getArray();
        int[] expected={1,4,6,7,25,25,56,78,792};
        Assert.assertEquals(actual,expected);
    }
}