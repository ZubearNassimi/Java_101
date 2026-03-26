package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Sunday October 11,2020
Assignment 02A
ComputeRoots.java
This program displays the square root and cube root of inputs*/

import java.util.*;

public class ComputeRoots
{
    /**@author Zubear Nassimi*/

    public static void main(String[]args)
    {
        //Input

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter five numbers separated by a space");
        int n1=scanner.nextInt();
        int n2=scanner.nextInt();
        int n3=scanner.nextInt();
        int n4=scanner.nextInt();
        int n5=scanner.nextInt();

        //Processing

        double s1=Math.sqrt(n1);
        double s2=Math.sqrt(n2);
        double s3=Math.sqrt(n3);
        double s4=Math.sqrt(n4);
        double s5=Math.sqrt(n5);

        double c1=Math.cbrt(n1);
        double c2=Math.cbrt(n2);
        double c3=Math.cbrt(n3);
        double c4=Math.cbrt(n4);
        double c5=Math.cbrt(n5);

        //Output

        System.out.print("Number");

        String sr="Square Roots";
        System.out.printf("%17s",sr);

        String cr="Cube Roots";
        System.out.printf("%15s\n",cr);

        System.out.print(n1);
        System.out.printf("%19.3f",s1);
        System.out.printf("%16.3f\n",c1);

        System.out.print(n2);
        System.out.printf("%19.3f",s2);
        System.out.printf("%16.3f\n",c2);

        System.out.print(n3);
        System.out.printf("%19.3f",s3);
        System.out.printf("%16.3f\n",c3);

        System.out.print(n4);
        System.out.printf("%19.3f",s4);
        System.out.printf("%16.3f\n",c4);

        System.out.print(n5);
        System.out.printf("%19.3f",s5);
        System.out.printf("%16.3f\n",c5);
    }
}
