package com.epam.day1.task10.service;

import com.epam.day1.task10.report.FunctionReport;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;

public class FunctionTest
{

    @Test
    public void testSolution()
    {
        FunctionReport functionReport=new FunctionReport();
        Function function=new Function();
        HashMap<Double,Double> actualHashMap=function.solution(1,2,1);
        HashMap<Double,Double> expectedHasMap = new HashMap<>();
        expectedHasMap.put(1.0,Math.tan(1));

        Assert.assertEquals(actualHashMap,expectedHasMap);
    }
}