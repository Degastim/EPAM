package com.epam.day1.task3.service;

import com.epam.day1.task3.entity.Square;

public class SquareService
{
    public double findRadiusByAreaOfDescribedSquare(Square square)
    {
        return Math.sqrt(square.getArea()/4);
    }

}
