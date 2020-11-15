package com.epam.day1.task1.service;


import com.epam.day1.task1.report.SolverReport;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SolverServiceTest
{
    SolverReport solverReport=new SolverReport();

    @Test
    public void testSolver()
    {
        int expected1=6;
        int expected2=5;
        int actual1=new SolverService().solver(14);
        int actual2=new SolverService().solver(35);
        Assert.assertEquals(actual1,expected1);
        Assert.assertEquals(actual2,expected2);
    }
}