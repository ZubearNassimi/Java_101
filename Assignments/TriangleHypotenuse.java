package Assignments;
//PROG10082 Class 1209_24071
//instructor - Satyendra Narayan
//September 24,2020
//Assignment 01C
//TriangleHypotenuse.java
/*This program calculates and displays the Hypotenuse of a right angle triangle*/

import java.text.*;

public class TriangleHypotenuse {

    /**@author Zubear Nassimi
     * @version 1.0
     * @param args String array
     * @since 2020-09-24*/

    public static void main(String[]args){

        double base=(int)(0+Math.random()*6);   //picks random integer from 0 to 6 for base of triangle
        double height=(int)(0+Math.random()*6); //picks random integer from 0 to 6 for height of triangle
        double power=2.0;                       //uses a constant (class variable) for 2.0 as instructed
        double hypotenuse=Math.sqrt(Math.pow(base,power)+(Math.pow(height,power))); //calculates hypotenuse for triangle

        System.out.println("The hypotenuse of a triangle with a base of " +base+
                " and a height of "+height+
                " is equal to " +DecimalFormat.getInstance().format(hypotenuse));
    }
}
