package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Sunday November 8,2020
Assignment 3A
Assignments.SalesAssignment3A.java
This program computes sales commissions if the user enters the sales amount from the keyboard*/
import java.util.*;

public class Sales3A
{
    /**@author Zubear Nassimi*/

    public static void main(String[]args)
    {

        /*
        INPUT
        sa = sales amount
        ca = commission amount
        cr = commission rate
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter sales amount");
        double sa=scanner.nextDouble();

        double cr1=0.08;
        double cr2=0.10;
        double cr3=0.12;
        double ca;

        boolean sa1=(sa>=1 && sa<=5000);
        boolean sa2=(sa>=5001 && sa<=10000);
        boolean sa3=(sa>=10001);

        //PROCESSING AND OUTPUT

        if (sa1)
        {
            ca=sa*cr1;
            System.out.printf("The commission is $%4.2f for sales amount of $%4.2f\n",ca,sa);
        }
        else if (sa2)
        {
            ca=(sa-5000)*cr2 +(5000*cr1);
            System.out.printf("The commission is $%4.2f for sales amount of $%4.2f\n",ca,sa);
        }
        else if (sa3)
        {
            ca=(sa-10000)*cr3 +(5000*cr1) +(5000*cr2);
            System.out.printf("The commission is $%4.2f for sales amount of $%4.2f\n",ca,sa);
        }
        else
            System.out.println("Invalid entry, sales amount must be at least $1");
    }
}
