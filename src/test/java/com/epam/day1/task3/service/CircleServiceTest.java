package com.epam.day1.task3.service;

import com.epam.day1.task3.entity.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleServiceTest
{

    @Test
    public void testFindAreaOfSquareInscribedInCircle()
    {
        double expected=200;
        Circle circle=new Circle();
        CircleService circleService=new CircleService();
        circle.setRadius(10);
        double actual=circleService.findAreaOfSquareInscribedInCircle(circle);
        Assert.assertEquals(actual,expected);
    }
}