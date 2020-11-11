package com.epam.task5.service;

import java.util.ArrayList;

public class Service
{

    public boolean compare(int number)
    {
        int sum=0;
        for (int i=1;i<Math.sqrt(number);i++)
        {
            if (number%i==0) sum+=number;
        }
        if(sum==number) return true;
        else return false;
    }
}
