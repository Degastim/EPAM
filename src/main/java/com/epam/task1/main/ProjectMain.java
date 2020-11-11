package com.epam.task1.main;

import com.epam.task1.report.SolverReport;
import com.epam.task1.service.SolverService;

public class ProjectMain
{
    public static void main(String[] args)
    {
    SolverReport solverReport=new SolverReport();
    solverReport.output(new SolverService().solver(14));
    solverReport.output(new SolverService().solver(39));

    }
}
