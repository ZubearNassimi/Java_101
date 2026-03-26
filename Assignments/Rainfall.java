package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
friday November 13,2020
Homework RainFall
Assignments.rainfallClassActivity.java
This program displays the minimum,maximum and average rainfall of a user's data inputs*/
import java.util.*;
public class Rainfall
{
    /**@author Zubear Nasssimi*/

    public static void main(String[]args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter precipitation amount for each month of the year starting from January, separate by a space");
        double jan=scanner.nextDouble();
        double feb=scanner.nextDouble();
        double mar=scanner.nextDouble();
        double apr=scanner.nextDouble();
        double may=scanner.nextDouble();
        double jun=scanner.nextDouble();
        double jul=scanner.nextDouble();
        double aug=scanner.nextDouble();
        double sep=scanner.nextDouble();
        double oct=scanner.nextDouble();
        double nov=scanner.nextDouble();
        double dec=scanner.nextDouble();

        double[]rainFall= {jan,feb,mar,apr,may,jun,jul,aug,sep,oct,nov,dec};

        double sum=0;
        for (int i=0;i<rainFall.length;i++)
            sum=sum+rainFall[i];

        System.out.println("Total Rainfall for entire year is "+sum);

        double min= rainFall[0];
        for(int i=0;i<rainFall.length;i++)
        {
            if(rainFall[i]<min)
            {
                min=rainFall[i];
            }
        }
        System.out.println("minimum precipitation is "+min);

        double max= rainFall[0];
        for(int i=0;i<rainFall.length;i++)
        {
            if(rainFall[i]>max)
            {
                max=rainFall[i];
            }
        }
        System.out.println("maximum precipitation is "+max);
    }
}