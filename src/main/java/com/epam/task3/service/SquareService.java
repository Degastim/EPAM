package com.epam.task3.service;

import com.epam.task3.models.Square;

public class SquareService
{
    public double findRadiusByAreaOfDescribedSquare(Square square)
    {
        return Math.sqrt(square.getArea()/4);
    }

}
