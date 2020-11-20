package com.epam.day3.task1.service;

import com.epam.day3.service.BasketService;
import com.epam.day3.entity.Ball;
import com.epam.day3.entity.Basket;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;


public class BasketServiceTest
{
    Basket basket;
    BasketService basketService;
    Ball ball1;
    Ball ball2;
    @BeforeSuite
    public void setup()
    {
        basket=new Basket();
        basketService=new BasketService();
        ball1=new Ball(1,"Blue");
        ball2  =new Ball(3,"Blue");
        basket.addBall(ball1);
        basket.addBall(ball2);
    }

    @Test
    public void testCountingWeightBalls()
    {
        double actual=4;
        double expected=basketService.CountingWeightBalls(basket);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSearchBallsCertainColor()
    {
        int expected=2;
        int actual=basketService.SearchBallsCertainColor(basket,"Blue");
        Assert.assertEquals(actual,expected);
    }
}