package com.epam.day1.task3.entity;

public class Square
{
    private double area;

    public double getArea() {
        return area;
    }

    public void setArea(double sideLength) {
        this.area = sideLength;
    }

    public Square(double sideLength) {
        this.area = sideLength;
    }

    public Square() {
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("area=").append(area);
        sb.append('}');
        return sb.toString();
    }
}
