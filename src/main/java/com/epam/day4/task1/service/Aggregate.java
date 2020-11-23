package com.epam.day4.task1.service;

import com.epam.day4.task1.model.ArrayWrapper;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Aggregate
{
    private int number;
    public void fillConsole(ArrayWrapper arrayWrapper) {
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
    }

    public void fillFile(ArrayWrapper arrayWrapper, String fileName) throws FileNotFoundException {
        int[] array=arrayWrapper.getArray();
        Scanner scanner=new Scanner(new FileInputStream("src/main/resources/"+fileName));
        while (scanner.hasNextInt()) {
            int arrayLength = array.length;
            array=Arrays.copyOf(array,arrayLength+1);
            array[arrayLength] = scanner.nextInt();
        }
        arrayWrapper.setArray(array);
        scanner.close();
    }
    public void fillRandomNumber(ArrayWrapper arrayWrapper,int numberNewElement)
    {
        int[] array=arrayWrapper.getArray();
        int arrayLength=array.length;
        array=Arrays.copyOf(array,arrayLength+numberNewElement);
        for (int i=0;i<arrayLength+numberNewElement;i++)
        {
            array[i]= (int) (Math.random()*100);
        }
        arrayWrapper.setArray(array);
    }
}

