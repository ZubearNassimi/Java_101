package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Sunday November 22,2020
Assignment 3B modified
Assignments.SalesAssignment3BVersion2.java
This program computes sales amount if the user enters the sales commission from the keyboard*/
import java.util.*;

public class Sales3BVersion2
{
    /**@author Zubear Nassimi
     * version 2.0*/

    /*
        INPUT
        ca = commission amount
        cr = commission rate
        sa = sales amount
         */

    static final double cr1=0.08;
    static final double cr2=0.10;
    static final double cr3=0.12;
    static double sa;

    public static double computeSales(double ca)
    {

        if (ca>=0.08 && ca<=400)
            return sa=ca/cr1;

        else if (ca>=400.01 && ca<=900)
            return sa=(ca-400)/cr2 +(400/cr1);

        else if (ca>=900.01)
            return sa=(ca-900)/cr3 +(500/cr2) +(400/cr1);

        else
            return sa=0;
    }

    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sales commission");
        double ca=scanner.nextDouble();

        sa = computeSales(ca);

        System.out.printf("A sales amount of $%4.2f is needed to make a commission of $%4.2f\n",sa,ca);
    }
}