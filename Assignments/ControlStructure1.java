package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Sunday November 8,2020
Assignment Control Structure question 1
Assignments.ControlStructureAssignment1.java
This program computes the value of an investment for the next five years.*/
import java.util.*;

public class ControlStructure1
{
    /**@author Zubear Nassimi*/

    public static void main(String[]args)
    {
        //Input

        Scanner scanner=new Scanner(System.in);
        System.out.println("Type initial investment $");
        double ii=scanner.nextDouble();

        Scanner scanner2=new Scanner(System.in);
        System.out.println("Type initial rate %");
        double r=scanner2.nextDouble();

        double r2=(r/100)+1;        //converting user input into decimal and adding 1

        //processing and output

        System.out.printf("%-12s%-22s%s\n","Year","Interest","Value");

        for (int y=1;y<=4;y++)
        {
            double v=ii*Math.pow(r2,y);     //Compound interest formula.
            double i=v-(v/r2);              //total interest earned for that year.

            System.out.printf("%-13d$%-19.2f$%6.2f\n",y,i,v);
        }
    }
}
