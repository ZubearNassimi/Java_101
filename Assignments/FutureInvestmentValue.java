package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Sunday October 11,2020
Assignment 02B
FutureInvestmentValue.java
This program calculates Future investment value through user input */

import java.util.*;

public class FutureInvestmentValue
{
    /**@author Zubear Nassimi*/

    public static void main(String[]args)
    {
        System.out.println("Welcome to my Future investment Value Calculator");
        System.out.println("Do not enter letters or negative numbers");
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter investment amount");
        double inv=scanner.nextDouble();

        System.out.println("enter annual interest rate");
        double ir=scanner.nextDouble();

        System.out.println("enter number of years");
        double y=scanner.nextDouble();

        double av=inv*(Math.pow((1+(ir/1200)),(y*12)));
        System.out.printf("Accumulated value is $%.2f",av);
    }
}
