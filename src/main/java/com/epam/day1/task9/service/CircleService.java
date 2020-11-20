package com.epam.day1.task9.service;

import com.epam.day1.task9.entity.Circle;

public class CircleService {
    public double calculateLength(Circle circle) {
        return 2*Math.PI*circle.getRadius();
    }

    public double calculateArea(Circle circle) {
        return Math.PI*Math.pow(circle.getRadius(),2);
    }
}
