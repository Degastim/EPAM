package com.epam.day3.task1.entity;

public class Ball
{
    private double weight;
    private String colour;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Ball(double weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public Ball() {
    }
}
