package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Monday November 9,2020
Assignment Control Structure question 3
Assignments.ControlStructureAssignment3.java
This program reads a positive integer (1-15) from the user and prints a pyramid*/
import java.util.Scanner;

public class ControlStructure3
{
    /**@author Zubear Nassimi with alot of help from Chapter 5 Exercise 17, Introduction to Java Programming, Tenth Edition Y. Daniel LiangY.*/

    public static void main(String[]args)
    {
        int n;
        do
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter an integer from 1 to 15");
            n=scanner.nextInt();
        }
        while(n<1 || n>15);

        for (int initialValue=1;initialValue<=n;initialValue++)
        {
            for (int j=1;j<=(n-initialValue);j++)
            {
                System.out.print("\t"); //prints whitespaces before 1st triangle
            }
            for (int j=initialValue;j>=1;j--)
            {
                System.out.print(j+"\t"); //prints left side of triangle
            }
            for (int j=2;j<=initialValue;j++)
            {
                System.out.print(j+"\t"); //prints right side of triangle starting from column with digit 2
            }
            System.out.println();
        }
    }
}
