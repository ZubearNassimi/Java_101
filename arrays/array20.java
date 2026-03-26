package Lessons.arrays;

public class array20
{
    //deep copy

    public static void main(String[]args)
    {
        int[] sourceArray={2,3,1,5,10}; //creating and loading array
        int[] targetArray=new int[sourceArray.length]; //creating 5 element long array

        for (int i=0;i<sourceArray.length;i++)
            targetArray[i]=sourceArray[i];

        System.out.println("sourceArray"+"\t"+"targetArray");

        for (int i=0;i<sourceArray.length;i++)
            System.out.println(sourceArray[i]+"\t\t\t"+targetArray[i]);

        System.out.println();
        System.out.println("sourceArray"+"\t"+"targetArray");

        for (int i=0;i<sourceArray.length;i++)
        {
            targetArray[i] = 100;
            System.out.println(sourceArray[i] + "\t\t\t" + targetArray[i]);
        }
        System.out.println(sourceArray);
        System.out.println(targetArray);
    }
}
//This method is good for primitive data type, like int,double,boolean.
//this method is not for Strings
