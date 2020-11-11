package com.epam.task3.service;

import com.epam.task3.models.Circle;

public class CircleService
{
    public double FindAreaOfSquareInscribedInCircle(Circle circle)
    {
        return 2*circle.getRadius()*circle.getRadius();
    }
}
