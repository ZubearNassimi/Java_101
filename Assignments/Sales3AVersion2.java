package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Sunday November 22,2020
Assignment 3A modified
Assignments.SalesAssignment3AVersion2.java
This program computes sales commissions if the user enters the sales amount from the keyboard*/
import java.util.*;

public class Sales3AVersion2
{
    /**@author Zubear Nassimi
     * version 2.0*/

    /*
        INPUT
        sa = sales amount
        ca = commission amount
        cr = commission rate
         */

    static final double cr1=0.08;
    static final double cr2=0.10;
    static final double cr3=0.12;
    static double ca;

    public static double computeCommission(double sa)
    {

        if (sa>=1 && sa<=5000)
            return ca=sa*cr1;

        else if (sa>=5001 && sa<=10000)
            return ca=(sa-5000)*cr2 +(5000*cr1);

        else if (sa>=10001)
            return ca=(sa-10000)*cr3 +(5000*cr1) +(5000*cr2);

        else
            return ca=0;
    }

    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter sales amount");
        double sa=scanner.nextDouble();

        boolean sa1=(sa>=1 && sa<=5000);
        boolean sa2=(sa>=5001 && sa<=10000);
        boolean sa3=(sa>=10001);

        ca = computeCommission(sa);

        System.out.printf("The commission is $%4.2f for sales amount of $%4.2f\n",ca,sa);
    }
}
