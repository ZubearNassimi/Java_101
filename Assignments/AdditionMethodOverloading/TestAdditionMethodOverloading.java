package Assignments.AdditionMethodOverloading;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
saturday November 28,2020
Homework Method Overloading
Assignments.TestAdditionMethodOverloading.java
This program displays a user's input total by importing a overloaded method*/

import java.util.*;
public class TestAdditionMethodOverloading
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter 3 numbers to add");
        double num1= scanner.nextDouble();
        double num2= scanner.nextDouble();
        double num3= scanner.nextDouble();

        double result = AdditionMethodOverloading.addition(num1, num2, num3);

        System.out.println("the total of the numbers is "+result);
    }
}
