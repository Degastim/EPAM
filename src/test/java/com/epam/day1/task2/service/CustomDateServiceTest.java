package com.epam.day1.task2.service;

import com.epam.day1.task2.entity.CustomDate;
import org.testng.Assert;
import org.testng.annotations.Test;


public class CustomDateServiceTest
{
    CustomDate customDate=new CustomDate();
    CustomDateService customDateService=new CustomDateService();
    @Test
    public void testFindAmountOfDays()
    {
        int expected=29;
        customDate.setMonthNumber(2);
        customDate.setYearNumber(2000);
        int actual=customDateService.findAmountOfDays(customDate);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testDeterminationOfLeapYear()
    {
        customDate.setYearNumber(2000);
        Assert.assertTrue(customDateService.determinationOfLeapYear(customDate));
    }
}