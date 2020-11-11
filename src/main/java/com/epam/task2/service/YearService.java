package com.epam.task2.service;

import com.epam.task2.entity.Year;

public class YearService
{
    public boolean determinationOfLeapYear(Year year)
    {
        if(year.getNumber()%400==0)
        {
            return true;
        }
        else if(year.getNumber()%4==0 && year.getNumber()%100==0)
        {
            return false;
        }
        else return false;
    }
}
