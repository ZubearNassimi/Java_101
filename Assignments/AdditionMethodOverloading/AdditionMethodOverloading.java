package Assignments.AdditionMethodOverloading;

/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
saturday November 28,2020
Homework Method Overloading
Assignments.additionMethodOverloading.java
This program overloads a method*/
public class AdditionMethodOverloading
{
    public static int addition(int num1, int num2)
    {
        return num1+num2;
    }
    public static int addition(int num1, int num2, int num3)
    {
        return num1+num2+num3;
    }
    public static double addition(double num1, double num2)
    {
        double result;
        result= num1+num2;

        return result;
    }
    public static double addition(double num1, double num2, double num3)
    {
        double result;
        result= num1+num2+num3;

        return result;
    }
}
