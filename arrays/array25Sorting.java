package Lessons.arrays;

import java.util.Arrays;

public class array25Sorting
{
    public static void main(String[]args)
    {
        int sourceArray[]={2,3,1,5,10};
        int targetArray[]=new int[sourceArray.length];

        System.arraycopy(sourceArray,0,targetArray,0,sourceArray.length);

        Arrays.sort(sourceArray);
        //Arrays.sort(targetArray);

        System.out.println("sourceArray"+"\t"+"targetArray");

        for (int i = 0; i < sourceArray.length; i++)
            System.out.println(sourceArray[i] + "\t\t" + targetArray[i]);
    }
}
//sort method is static
