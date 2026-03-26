package Assignments;
//Zubear Nassimi
//PROG10082 Class 1209_24071
//instructor - Satyendra Narayan
//October 08,2020
//Session 3.2 Class Activity
//Exercise c) RestaurantTip.java
/*This program calculates the tip of a waiter through customer input*/
import javax.swing.*;

public class RestaurantTip
{
    public static void main(String[]args)
    {
        String input1=JOptionPane.showInputDialog("How much was your bill today?");
        double b=Double.parseDouble(input1);
        String input2=JOptionPane.showInputDialog("Enter Percentage amount you would like to tip");
        double p=Double.parseDouble(input2);
        double t=(p/100*b);

        System.out.printf("You should tip your waiter $%4.2f\n",t);
    }
}
