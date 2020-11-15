package com.epam.day3.task1.service;

import com.epam.day3.task1.entity.Ball;
import com.epam.day3.task1.entity.Basket;
import org.testng.Assert;
import org.testng.annotations.Test;


public class BasketServiceTest
{
    Basket basket=new Basket();
    BasketService basketService=new BasketService();
    Ball ball1=new Ball(1,"Blue");
    Ball ball2=new Ball(3,"Blue");
    @Test
    public void testCountingWeightBalls()
    {
        double actual=4;
        basket.addBall(ball1);
        basket.addBall(ball2);
        double expected=basketService.CountingWeightBalls(basket);
        Assert.assertEquals(actual,expected);
    }

    @Test
    public void testSearchBallsCertainColor()
    {
        int expected=2;
        basket.addBall(ball1);
        basket.addBall(ball2);
        int actual=basketService.SearchBallsCertainColor(basket,"Blue");
        Assert.assertEquals(actual,expected);
    }
}