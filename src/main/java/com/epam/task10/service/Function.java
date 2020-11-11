package com.epam.task10.service;

import java.util.HashMap;

public class Function
{
    public HashMap<Double,Double> solution(double a, double b, double h)
    {
        HashMap<Double,Double> hashMap=new HashMap<>();
        double f;
        for (double i=a;i<b;i+=h)
        {
            f=Math.tan(i);
            hashMap.putIfAbsent(i,f);

        }
        return hashMap;
    }
}
