package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Saturday October 24,2020
Assignment 02B Part 2
ProperImproperMixedFractions.java
This program gets input from user and identify if the fraction is proper,improper or mixed*/

import java.util.*;

public class ProperImproperMixedFractions
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a numerator");
        int x=scanner.nextInt();
        System.out.println("Enter a denominator");
        int y=scanner.nextInt();
        int z=x%y;
        int z2=x/y;

        if(x>=y && z==0)
        {
            System.out.println(x + " / " + y + " is an improper fraction and it can be reduced to "+z2);
        }
        if(x>=y && z!=0)
        {
            System.out.println(x+" / "+y+" is an improper function and its mixed fraction is "+z2+ " + "+z+" / "+y);
        }
        else if(x<y)
        {
            System.out.println(x + " / " + y + " is a proper fracion");
        }
    }
}
