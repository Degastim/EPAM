package com.epam.task5.main;

import com.epam.task5.report.Report;
import com.epam.task5.service.Service;

public class ProjectMain
{
    public static void main(String[] args)
    {
        Service service=new Service();
        Report report=new Report();
        report.report(service.compare(3));
    }
}
