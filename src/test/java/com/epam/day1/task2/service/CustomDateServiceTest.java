package com.epam.day1.task2.service;

import com.epam.day1.task2.entity.CustomDate;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CustomDateServiceTest {
    CustomDate customDate;
    CustomDateService customDateService;

    @BeforeSuite
    public void setup() {
        customDate=new CustomDate();
        customDateService=new CustomDateService();
        customDate.setMonthNumber(2);
        customDate.setYearNumber(2000);
    }

    @Test
    public void testFindAmountOfDays() {
        int expected=29;
        int actual=customDateService.findAmountOfDays(customDate);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testDeterminationOfLeapYear() {
        Assert.assertTrue(customDateService.determinationOfLeapYear(customDate));
    }
}