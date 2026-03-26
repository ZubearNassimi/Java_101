package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Tuesday November 10,2020
Assignment Control Structure question 4
Assignments.ControlStructureAssignment4.java
This program prints a pyramid, the digits multiply by 2 as it closes in to the center*/

public class ControlStructure4
{
    /**@author Zubear Nassimi*/
    //same code as previous question, just played around with code until reached desired output.
    //it was not easy sir, took me hours but felt so good when i got it!

    public static void main(String[]args)
    {
        for (int initialValue=0;initialValue<=7;initialValue++)
        {
            for (int j=0;j<=(7-initialValue);j++)
            {
                System.out.print("\t");
            }
            for (int j=0;j<=initialValue;j++)
            {
                System.out.print((int)Math.pow(2,j)+"\t");
            }
            for (int j=initialValue;j>=1;j--)
            {
                System.out.print((int)Math.pow(2,j-1)+"\t");
            }
            System.out.println();
        }
    }
}