package com.epam.day1.task8.service;

public class Equation {
    public double solutionEquation(double x) {
        if(x>=3) {
            return -x*x+3*x+9;
        }
        else return 1/(x*x*x-6);
    }
}
