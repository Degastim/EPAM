package com.epam.task9.service;

import com.epam.task9.Model.Circle;

public class CircleService
{
    public double calculateLength(Circle circle)
    {
        return 2*Math.PI*circle.getRadius();
    }
    public double calculateArea(Circle circle)
    {
        return Math.PI*Math.pow(circle.getRadius(),2);
    }
}
