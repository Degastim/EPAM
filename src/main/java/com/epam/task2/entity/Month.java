package com.epam.task2.entity;

public class Month
{
    private int number;


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Month(int number) {
        this.number = number;
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Number of days in this month{");
        sb.append("number=").append(number);
        sb.append('}');
        return sb.toString();
    }
}
