package Exercises;
//Zubear Nassimi
//PROG10082 Class 1209_24071
//instructor - Satyendra Narayan
//October 08,2020
//Session 3.2 Class Activity
//Exercise b) HeartRate.java
/*This program calculates the target heart rate of an individual through user input*/
import java.util.*;

public class HeartRate
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter integer for your resting heart rate");
        int a=scanner.nextInt();
        System.out.println("Enter your age");
        int b=scanner.nextInt();

        System.out.println("Your target heart rate should be "+((0.7*(220-b))+(0.3*a))+" while working out");
    }
}
