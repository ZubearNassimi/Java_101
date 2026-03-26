package Exercises;
//Zubear Nassimi
//PROG10082 Class 1209_24071
//instructor - Satyendra Narayan
//October 08,2020
//Session 3.2 Class Activity
//Exercise e) GradeAverage.java
/*This program calculates the average of 5 numbers through user input*/
import java.util.*;
public class GradeAverage
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your grades for all 5 classes");
        double int1=scanner.nextDouble();
        double int2=scanner.nextDouble();
        double int3=scanner.nextDouble();
        double int4=scanner.nextDouble();
        double int5=scanner.nextDouble();

        double a=((int1+int2+int3+int4+int5)/5);
        System.out.printf("The five grades you have entered are: %3.1f %3.1f %3.1f %3.1f %3.1f\n",int1,int2,int3,int4,int5);
        System.out.printf("Your average grade is %3.1f percent\n",a);
    }
}
