package com.epam.day1.task1.service;

public class SolverService {
    public int solver(int number) {
        if(number%10<=3) return (number%10)*(number%10);
        else return (number%10)*(number%10)%10;
    }
}
