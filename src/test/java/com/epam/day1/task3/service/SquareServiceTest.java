package com.epam.day1.task3.service;

import com.epam.day1.task3.entity.Square;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SquareServiceTest
{
    Square square=new Square();
    SquareService squareService=new SquareService();
    @Test
    public void testFindRadiusByAreaOfDescribedSquare()
    {
        double expected=1;
        square.setArea(4);
        double actual=squareService.findRadiusByAreaOfDescribedSquare(square);
        Assert.assertEquals(actual,expected);
    }
}