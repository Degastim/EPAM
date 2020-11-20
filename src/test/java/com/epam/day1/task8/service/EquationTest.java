package com.epam.day1.task8.service;

import org.testng.Assert;
import org.testng.annotations.Test;

public class EquationTest {
    @Test
    public void testSolutionEquation() {
        Equation equation=new Equation();
        double actual=equation.solutionEquation(20);
        double expected=-331;
        Assert.assertEquals(actual,expected);
    }
}