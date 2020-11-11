package com.epam.task2.main;

import com.epam.task2.entity.Month;
import com.epam.task2.entity.Year;
import com.epam.task2.report.YearAndMonthReport;
import com.epam.task2.service.MonthService;
import com.epam.task2.service.YearService;

public class ProjectMain
{
    public static void main(String[] args) {
        Month month=new Month(10);
        Year year=new Year(2020);
        YearService yearService=new YearService();
        MonthService monthService=new MonthService();
        YearAndMonthReport yearAndMonthReport=new YearAndMonthReport();
        yearAndMonthReport.report(yearService.determinationOfLeapYear(year),monthService.findAmountOfDays(month));
    }
}
