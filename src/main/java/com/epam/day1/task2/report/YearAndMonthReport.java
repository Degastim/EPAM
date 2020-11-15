package com.epam.day1.task2.report;

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
