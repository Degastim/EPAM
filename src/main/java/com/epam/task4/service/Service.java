package com.epam.task4.service;

public class Service
{
    public boolean service(int numberOfEven,int ... i)
    {
        for (int j:i)
        {
            if (j%2==0) numberOfEven--;
        }
        if(numberOfEven<=0) return true;
        else return false;
    }
}
