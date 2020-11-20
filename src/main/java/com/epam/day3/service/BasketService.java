package com.epam.day3.service;

import com.epam.day3.entity.Ball;
import com.epam.day3.entity.Basket;
import java.util.List;

public class BasketService {
    public double CountingWeightBalls(Basket basket) {
        double wholeWeight=0;
        List<Ball> balls = basket.getBalls();
        for (Ball i : balls) {
            wholeWeight+=i.getWeight();
        }
        return  wholeWeight;
    }

    public int SearchBallsCertainColor(Basket basket,String searchСolour) {
        int numberBallsSameColor=0;
        List<Ball> balls = basket.getBalls();
        for(Ball i:balls) {
            String ballColour=i.getColour();
            if(ballColour.equals(searchСolour)) {
                numberBallsSameColor++;
            }
        }
        return numberBallsSameColor;
    }
}
