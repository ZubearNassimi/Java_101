package Lessons.arrays;

import java.util.Arrays;

public class array26BinarySearch
{
    public static void main(String[]args)
    {
        int sourceArray[]={2,3,1,5,10};
        int targetArray[]=new int[sourceArray.length];

        System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length);

        Arrays.sort(sourceArray);
        Arrays.sort(targetArray);

        int j=Arrays.binarySearch(sourceArray,4);
        System.out.println("j = "+j);

        System.out.println("sourceArray"+"\t"+"targetArray");

        for (int i = 0; i < sourceArray.length; i++)
            System.out.println(sourceArray[i] + "\t\t" + targetArray[i]);
    }
}

//if search key is not found. it will return (-(index number) -1)
//j = -3-1=-4
//element 1 returns -1 if not found
