package com.epam.day1.task4.service;

public class Service
{
    public boolean service(int numberOfEven,int ... i)
    {
        for (int j:i)
        {
            if (j%2==0) numberOfEven--;
        }
        boolean result=numberOfEven <= 0;
        return result;
    }
}
