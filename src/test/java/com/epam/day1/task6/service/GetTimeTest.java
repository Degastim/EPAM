package com.epam.day1.task6.service;

import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class GetTimeTest {

    @Test
    public void testGetHour()
    {
        int expectedHour=1;
        int expectedMinute=40;
        int expectedSecond=0;
        GetTime getTime=new GetTime();
        Assert.assertEquals(getTime.getHour(6000),expectedHour);
        Assert.assertEquals(getTime.getMinute(6000),expectedMinute);
        Assert.assertEquals(getTime.getSecond(6000),expectedSecond);
    }
}