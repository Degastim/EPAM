package com.epam.day4.task1.service;

import com.epam.day4.task1.model.Array;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Reader {
    private int number;
    private Logger Logger=LogManager.getLogger();

    public void fillFromConsole(Array arrayWrapper) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number of elements of the array");
        int number=scanner.nextInt();
        int[] array=arrayWrapper.getArray();
        int arrayLength= array.length;
        array=Arrays.copyOf(array,arrayLength+number);
        for (int i=0;i<number;i++) {
            array[arrayLength+i]=scanner.nextInt();
        }
        arrayWrapper.setArray(array);
        scanner.close();
        Logger.info("Array filled from console");
    }

    public void fillFromFile(Array arrayWrapper, String fileName) {
        int[] array=arrayWrapper.getArray();
        Scanner scanner=null;
        try{
            scanner=new Scanner(new FileInputStream("src/main/resources/"+fileName));
            while (scanner.hasNextInt()) {
                int arrayLength = array.length;
                array=Arrays.copyOf(array,arrayLength+1);
                array[arrayLength] = scanner.nextInt();
            }
            arrayWrapper.setArray(array);
            Logger.info("Array filled from file");
        }
       catch (FileNotFoundException e) {
           Logger.error("Error filling from file.Error"+e);
       }
        finally {
            scanner.close();
        }
    }

    public void fillRandomNumber(Array arrayWrapper, int numberNewElement) {
        int[] array=arrayWrapper.getArray();
        int arrayLength=array.length;
        array=Arrays.copyOf(array,arrayLength+numberNewElement);
        for (int i=0;i<arrayLength+numberNewElement;i++) {
            array[i]= (int) (Math.random()*100);
        }
        arrayWrapper.setArray(array);
        Logger.info("Array is filled with random numbers");
    }
}

