package com.epam.day1.task6.main;

import com.epam.day1.task6.report.TimeReport;
import com.epam.day1.task6.service.GetTime;

public class ProjectMain
{
    public static void main(String[] args)
    {
        int second=6000;
        GetTime getTime=new GetTime();
        TimeReport timeReport=new TimeReport();
        timeReport.OutputHourMinuteSecond(getTime.getHour(second),getTime.getMinute(second),getTime.getSecond(second));
    }
}
