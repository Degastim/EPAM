package com.epam.day1.task6.main;

import com.epam.day1.task6.report.TimeReport;
import com.epam.day1.task6.service.TimeService;

public class ProjectMain {
    public static void main(String[] args) {
        int second=6000;
        TimeService timeService =new TimeService();
        TimeReport timeReport=new TimeReport();
        timeReport.OutputHourMinuteSecond(timeService.getHour(second), timeService.getMinute(second), timeService.getSecond(second));
    }
}
