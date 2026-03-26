package Assignments;
//Zubear Nassimi
//PROG10082 Class 1209_24071
//instructor - Satyendra Narayan
//October 08,2020
//Session 3.2 Class Activity
//Exercise d) PopcornProfit.java
/*This program calculate gross and net profit*/
import java.util.*;
public class PopcornProfit
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter cost of bucket");
        double i1=scanner.nextDouble();
        System.out.println("enter cost of butter");
        double i2=scanner.nextDouble();
        System.out.println("enter cost of popcorn");
        double i3=scanner.nextDouble();
        System.out.println("enter selling price for one bucket of popcorn");
        double i4=scanner.nextDouble();

        double p=i4-(i1+i2+i3);
        System.out.printf("If you sell a bucket a popcorn for $%4.2f you will make $%4.2f in profit\n",i4,p);
    }
}
