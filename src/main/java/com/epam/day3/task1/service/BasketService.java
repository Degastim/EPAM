package com.epam.day3.task1.service;

import com.epam.day3.task1.entity.Ball;
import com.epam.day3.task1.entity.Basket;

import java.util.List;

public class BasketService
{
    public double CountingWeightBalls(Basket basket)
    {
        double wholeWeight=0;
        List<Ball> balls = basket.getBalls();
        for (Ball i : balls)
        {
            wholeWeight+=i.getWeight();
        }
        return  wholeWeight;
    }
    public int SearchBallsCertainColor(Basket basket,String colour)
    {
        int numberBallsSameColor=0;
        List<Ball> balls = basket.getBalls();
        for(Ball i:balls)
        {
            String ballColour=i.getColour();
            if(ballColour.equals(colour))
            {
                numberBallsSameColor++;
            }
        }
        return numberBallsSameColor;
    }
}
