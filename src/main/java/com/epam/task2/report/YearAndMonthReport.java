package com.epam.task2.report;

import com.epam.task2.entity.Month;
import com.epam.task2.entity.Year;

public class YearAndMonthReport
{
    public void report(boolean leapYear,int  amountOfDays)
    {
        if(leapYear)
        {
            System.out.println("Leap year");
        }
        else System.out.println("Common year");
        System.out.println(amountOfDays);
    }
}
