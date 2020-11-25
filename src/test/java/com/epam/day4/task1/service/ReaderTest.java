package com.epam.day4.task1.service;

import com.epam.day4.task1.model.Array;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ReaderTest {
    Reader reader;
    Array array;
    @BeforeMethod
    public void setUp() {
        reader=new Reader();
        array =new Array();
    }

    @Test
    public void testFillFromFile() {
       reader.fillFromFile(array,"text.txt");
        int[] actual= array.getArray();
        int[] expected={1,2,3,4};
        Assert.assertEquals(actual,expected);
    }
}