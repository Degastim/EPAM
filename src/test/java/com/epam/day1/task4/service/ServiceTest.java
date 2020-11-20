package com.epam.day1.task4.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ServiceTest {
    @Test
    public void testService() {
        Service service=new Service();
        boolean actual=service.service(2,2,2,3,4);
        Assert.assertTrue(actual);
    }
}