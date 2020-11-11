package com.epam.task3.models;

public class Square
{
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double sideLength) {
        this.area = sideLength;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(" Area {");
        sb.append("Area=").append(area);
        sb.append('}');
        return sb.toString();
    }

    public Square(double sideLength) {
        this.area = sideLength;
    }
    public Square() { }
}
