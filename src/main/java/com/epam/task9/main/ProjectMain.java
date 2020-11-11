package com.epam.task9.main;

import com.epam.task9.Model.Circle;
import com.epam.task9.report.CircleReport;
import com.epam.task9.service.CircleService;

public class ProjectMain
{
    public static void main(String[] args)
    {
        Circle circle=new Circle(10);
        CircleService circleService=new CircleService();
        CircleReport circleReport=new CircleReport();
        circleReport.report(circleService.calculateLength(circle),circleService.calculateArea(circle));
    }
}
