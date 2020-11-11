package com.epam.task4.report;

public class Report
{
    public void report(boolean bool,int numberOfEven)
    {
        if (bool) {
            System.out.println("There are at least " + numberOfEven + " even");
        } else {
            System.out.println("No at least " + numberOfEven + " even");
        }
    }
}
