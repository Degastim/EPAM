package com.epam.day1.task2.entity;

public class CustomDate {
    int monthNumber;
    int yearNumber;

    public int getMonthNumber() {
        return monthNumber;
    }

    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;
    }

    public int getYearNumber() {
        return yearNumber;
    }

    public void setYearNumber(int yearNumber) {
        this.yearNumber = yearNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomDate{");
        sb.append("monthNumber=").append(monthNumber);
        sb.append(", yearNumber=").append(yearNumber);
        sb.append('}');
        return sb.toString();
    }
}
