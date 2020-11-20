package com.epam.day1.task5.main;

import com.epam.day1.task5.report.Report;
import com.epam.day1.task5.service.Service;

public class ProjectMain {
    public static void main(String[] args) {
        Service service=new Service();
        Report report=new Report();
        report.report(service.compare(6));
    }
}
