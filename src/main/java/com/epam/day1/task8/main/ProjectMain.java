package com.epam.day1.task8.main;

import com.epam.day1.task8.report.EquationReport;
import com.epam.day1.task8.service.Equation;

public class ProjectMain
{
    public static void main(String[] args)
    {
        Equation equation=new Equation();
        EquationReport equationReport=new EquationReport();
        equationReport.solution(equation.solutionEquation(10));
    }
}
