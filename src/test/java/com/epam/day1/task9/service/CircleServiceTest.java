package com.epam.day1.task9.service;

import com.epam.day1.task9.entity.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CircleServiceTest
{
    Circle circle=new Circle();
    CircleService circleService=new CircleService();
    @Test
    public void testCalculateLength()
    {
        circle.setRadius(10);
        double expected=2*Math.PI*circle.getRadius();
        double actual=circleService.calculateLength(circle);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testCalculateArea()
    {
        circle.setRadius(10);
        double expected= Math.PI*Math.pow(circle.getRadius(),2);
        double actual=circleService.calculateArea(circle);
        Assert.assertEquals(actual,expected);
    }
}