package com.epam.day4.task2.report;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ProjectReport {
    Logger Logger= LogManager.getLogger();
    public void ReportArray(int[][] array) {
        for(int[] i:array) {
            for(int j:i)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        Logger.info("Report from array");
    }
}
