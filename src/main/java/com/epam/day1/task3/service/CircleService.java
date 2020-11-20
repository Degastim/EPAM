package com.epam.day1.task3.service;

import com.epam.day1.task3.entity.Circle;
import com.epam.day1.task3.entity.Square;

public class CircleService {
    public double findAreaOfSquareInscribedInCircle(Circle circle) {
        return 2*Math.pow(circle.getRadius(),2);
    }
    public double calculateDifferenceArea(Square describedSquare, Square inscribedSquare)
    {
        return describedSquare.getArea()/inscribedSquare.getArea();
    }
}
