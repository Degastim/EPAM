package com.epam.day4.task2.report;

import com.epam.day4.task1.model.Array;

public class ProjectReport {
    public void ReportArray(int[][] array) {
        for(int[] i:array) {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
