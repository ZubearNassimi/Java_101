package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Sunday November 8,2020
Assignment 3B
Assignments.Sales3B.java
This program computes sales amount if th user enters the sales commission from the keyboard*/
import java.util.*;

public class Sales3B
{
    /**@author Zubear Nassimi*/

    public static void main(String[]args)
    {

        /*
        INPUT
        ca = commission amount
        cr = commission rate
        sa = sales amount
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the sales commission");
        double ca=scanner.nextDouble();

        double cr1=0.08;
        double cr2=0.10;
        double cr3=0.12;
        double sa;

        boolean ca1=(ca>=0.08 && ca<=400);
        boolean ca2=(ca>=400.01 && ca<=900);
        boolean ca3=(ca>=900.01);

        //PROCESSING AND OUTPUT

        if (ca1)
        {
            sa=ca/cr1;
            System.out.printf("A sales amount of $%4.2f is needed to make a commission of $%4.2f\n",sa,ca);
        }
        else if (ca2)
        {
            sa=(ca-400)/cr2 +(400/cr1);
            System.out.printf("A sales amount of $%4.2f is needed to make a commission of $%4.2f\n",sa,ca);
        }
        else if (ca3)
        {
            sa=(ca-900)/cr3 +(500/cr2) +(400/cr1);
            System.out.printf("A sales amount of $%4.2f is needed to make a commission of $%4.2f\n",sa,ca);
        }
        else
            System.out.println("Invalid entry, the minimum Commission amount is $0.08");
    }
}
