package com.epam.task10.main;

import com.epam.task10.report.FunctionReport;
import com.epam.task10.service.Function;

import java.util.HashMap;

public class ProjectMain
{
    public static void main(String[] args)
    {
        FunctionReport functionReport=new FunctionReport();
        Function function=new Function();
        HashMap<Double,Double> hashMap=function.solution(1,10,2);
        functionReport.report(hashMap);
    }
}

