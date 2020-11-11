package com.epam.task3.report;

import com.epam.task3.models.Square;

public class SquareReport
{
    public void InscribedSquare(Square square)
    {
        System.out.println("The area of the inscribed square is"+square);
    }
    public void compare(Square describedSquare,Square inscribedSquare)
    {
        System.out.println("The area of the inscribed square is "+describedSquare.getArea()/inscribedSquare.getArea()+" times less than the specified area");
    }
}
