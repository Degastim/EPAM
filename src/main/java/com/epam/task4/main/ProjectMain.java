package com.epam.task4.main;

import com.epam.task4.service.Service;
import com.epam.task4.report.Report;

public class ProjectMain
{
    public static void main(String[] args)
    {
        Report report= new Report();
        report.report(new Service().service(2,1,2,3,5),2);
    }
}
