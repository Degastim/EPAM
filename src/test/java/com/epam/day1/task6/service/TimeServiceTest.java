package com.epam.day1.task6.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TimeServiceTest {
    @Test
    public void testGetHour() {
        int expectedHour=1;
        int expectedMinute=40;
        int expectedSecond=0;
        TimeService timeService =new TimeService();
        Assert.assertEquals(timeService.getHour(6000),expectedHour);
        Assert.assertEquals(timeService.getMinute(6000),expectedMinute);
        Assert.assertEquals(timeService.getSecond(6000),expectedSecond);
    }
}