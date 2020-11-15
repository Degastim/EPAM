package com.epam.day1.task5.service;

import org.testng.Assert;
import org.testng.annotations.Test;


public class ServiceTest {

    @Test
    public void testCompare()
    {
        Service service=new Service();
        Assert.assertTrue(service.compare(6));
    }
}