package com.epam.day1.task6.service;

public class GetTime
{
    public int getHour(int second)
    {
        return second/3600;
    }

    public int getMinute(int second)
    {
        return (second-getHour(second)*3600)/60;
    }

    public int getSecond(int second)
    {
        return  second-getMinute(second)*60-getHour(second)*3600;
    }
}
