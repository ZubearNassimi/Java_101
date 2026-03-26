package Lessons.arrays;

public class array15
{
    public static void main(String[]args)
    {
        double myList[]=new double[10];

        //Loading array
        for (int i=0;i<myList.length;i++) //loading array into loop
        {
            myList[i]=(double)i;
        }

        //Printing array
        for (int i=0;i<myList.length;i++) //printing array content
        {
            System.out.println(myList[i]);
        }


    }
}
