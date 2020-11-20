package com.epam.day1.task3.report;

import com.epam.day1.task3.entity.Square;

public class SquareReport
{
    public void InscribedSquareReport(Square square) {
        System.out.println("The area of the inscribed square is"+square);
    }
    public void compareReport(Double solution) {
        System.out.println("The area of the inscribed square is "+solution+" times less than the specified area");
    }
}
