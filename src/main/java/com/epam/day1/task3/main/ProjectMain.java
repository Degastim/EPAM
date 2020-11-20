package com.epam.day1.task3.main;

import com.epam.day1.task3.report.SquareReport;
import com.epam.day1.task3.service.CircleService;
import com.epam.day1.task3.service.SquareService;
import com.epam.day1.task3.entity.Circle;
import com.epam.day1.task3.entity.Square;

public class ProjectMain {
    public static void main(String[] args) {
        Square describedSquare=new Square(16);
        SquareService squareService=new SquareService();
        Circle circle=new Circle(squareService.findRadiusByAreaOfDescribedSquare(describedSquare));
        CircleService circleService=new CircleService();
        Square inscribedSquare=new Square(circleService.findAreaOfSquareInscribedInCircle(circle));
        SquareReport squareReport=new SquareReport();
        squareReport.InscribedSquareReport(inscribedSquare);
        Double solution=circleService.calculateDifferenceArea(describedSquare,inscribedSquare);
        squareReport.compareReport(solution);
    }
}
