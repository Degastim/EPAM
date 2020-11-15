package com.epam.day1.task3.service;

import com.epam.day1.task3.entity.Circle;

public class CircleService
{
    public double FindAreaOfSquareInscribedInCircle(Circle circle)
    {
        return 2*Math.pow(circle.getRadius(),2);
    }
}
