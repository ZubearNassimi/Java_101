package Lessons.arrays;

public class array19Assigning
{
    public static void main(String[]args)
    {
        int[] sourceArray={2,3,1,5,10}; //creating and loading array
        int[] targetArray=new int[sourceArray.length]; //creating 5 element long array

        //This is called a Shallow copy

        targetArray=sourceArray; //it may work, but will not be the actual copy

        System.out.println(sourceArray);
        System.out.println(targetArray);
        System.out.println("sourceArray"+"\t"+"targetArray");

        for (int i=0;i<sourceArray.length;i++)
            targetArray[i]=100;

        for (int i=0;i<sourceArray.length;i++)
            System.out.println(sourceArray[i]+"\t\t\t"+targetArray[i]);
    }
}
