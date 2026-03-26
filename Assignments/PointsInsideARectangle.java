package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Saturday October 24,2020
Assignment 02B Part 1
PointsInsideARectangle.java
This program verifies if the two points entered by user is inside the coordinates of a rectangle*/

import java.util.*;

public class PointsInsideARectangle
{
    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a point with two coordinates");
        int x=scanner.nextInt();
        int y=scanner.nextInt();

        if (x<=5 && x>=-5);
        if (y<=2.5 && y>=-2.5)
        {
            System.out.println("Point (" + x + "," + y + ") is in the rectangle");
        }

        else
            System.out.println("Point ("+x+","+y+") is not in the rectangle");
    }
}
