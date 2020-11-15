package com.epam.day1.task2.service;

import com.epam.day1.task2.entity.CustomDate;

public class CustomDateService
{
    public int findAmountOfDays(CustomDate customDate)
    {
       if(customDate.getMonthNumber()==2)
       {
           if(determinationOfLeapYear(customDate))
           {
               return 29;
           }
           else
           {
               return 28;
           }
       }

        switch (customDate.getMonthNumber())
        {
            case (1):
            case (3):
            case (5):
            case (7):
            case (8):
            case (10):
            case (12):
                return 31;
            default:
                return 30;
        }
    }
    public boolean determinationOfLeapYear(CustomDate customDate)
    {
        if(customDate.getYearNumber()%400==0 || customDate.getYearNumber()%4==0 && customDate.getYearNumber()%100==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
