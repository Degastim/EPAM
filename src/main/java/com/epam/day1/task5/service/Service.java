package com.epam.day1.task5.service;

public class Service {
    public boolean compare(int number) {
        int sum=0;
        for (int i=1;i<=number/2;i++) {
            if (number%i==0) sum+=i;
        }
        return sum == number;
    }
}
