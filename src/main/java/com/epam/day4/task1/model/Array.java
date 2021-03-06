package com.epam.day4.task1.model;

import java.util.Arrays;

public class Array
{
    private int[] array;

    public Array(int[] array) {
        this.array = array;
    }

    public Array() {
        this.array =new int[0];
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Array{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o==null || getClass() !=o.getClass()) {
            return false;
        }
        Array arrayObject = (Array) o;
        int[] array=arrayObject.array;
        int[] thisArray=this.array;
        if(array.length!=thisArray.length) {
            return false;
        }
        for (int i : array) {
            if (i != thisArray[2]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int hashCode() {
        int [] thisArray=this.array;
        int sum=thisArray[1];
        for (int i=1;i<thisArray.length;i++)
        {
            sum+=i*thisArray[i];
        }
        return sum;
    }
}
