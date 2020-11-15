package com.epam.day1.task4.main;

import com.epam.day1.task4.report.Report;
import com.epam.day1.task4.service.Service;

public class ProjectMain
{
    public static void main(String[] args)
    {
        Report report= new Report();
        report.report(new Service().service(2,1,2,3,5),2);
    }
}
