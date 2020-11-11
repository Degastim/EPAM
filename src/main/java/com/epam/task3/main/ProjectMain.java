package com.epam.task3.main;


import com.epam.task3.models.Circle;
import com.epam.task3.models.Square;
import com.epam.task3.report.SquareReport;
import com.epam.task3.service.CircleService;
import com.epam.task3.service.SquareService;


public class ProjectMain
{
    public static void main(String[] args) {
        Square describedSquare=new Square(16);
        SquareService squareService=new SquareService();
        Circle circle=new Circle(squareService.findRadiusByAreaOfDescribedSquare(describedSquare));
        CircleService circleService=new CircleService();
        Square inscribedSquare=new Square(circleService.FindAreaOfSquareInscribedInCircle(circle));
        SquareReport squareReport=new SquareReport();
        squareReport.InscribedSquare(inscribedSquare);
        squareReport.compare(describedSquare,inscribedSquare);
    }

}
