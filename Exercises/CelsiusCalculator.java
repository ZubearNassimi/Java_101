package Exercises;
//Zubear Nassimi
//PROG10082 Class 1209_24071
//instructor - Satyendra Narayan
//October 08,2020
//Session 3.2 Class Activity
//Exercise a) CelsiusCalculator.java
/*This program converts Fahrenheit temperature to Celsius using user input*/
import javax.swing.*;
import java.text.DecimalFormat;

public class CelsiusCalculator
{
    public static void main(String[]args)
    {
        String input1=JOptionPane.showInputDialog("Enter temperature in Fahrenheit");
        double f=Double.parseDouble(input1);

        double c=((5.0/9.0)*(f-32.0));
        System.out.println(f +" Fahrenheit is equal to "+ DecimalFormat.getInstance().format(c)+" celcius");

        System.exit(0);
    }

}