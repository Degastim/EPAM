package com.epam.day1.task10.report;

import java.util.HashMap;

public class FunctionReport
{
    public void report(HashMap<Double,Double> hashMap)
    {
        for (Double i:hashMap.keySet())
        {
            System.out.println(i+":"+hashMap.get(i)+"\n");
        }

    }
}
