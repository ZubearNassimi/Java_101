package Lessons.arrays;

public class array11
{
    public static void main(String[]args)
    {
        double myList[]=new double[10];

        System.out.println("Size of the array is "+myList.length);

        System.out.println("Displaying default values of the array");

        for (int i =0; i<myList.length;i++) //printing array content
            System.out.println(myList[i]); //displaying default values
    }
}
