package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Monday November 9,2020
Assignment Control Structure question 2
Assignments.ControlStructureAssignment2.java
This program reads a positive integer from the user and will print a sequence starting from that integer*/
import java.util.*;

public class ControlStructure2
{
    /**@author Zubear Nassimi*/

    public static void main(String[]args)
    {
        int n;
        do
        {
            Scanner scanner=new Scanner(System.in);
            System.out.println("Enter a positive integer");
            n=scanner.nextInt();
        }
        while(n<=0);

        int counter=0;

        System.out.print(n+" ");

        while(n!=1)
        {
            counter+=1;
            if (n%2==0)
            {
                n=n/2;
                System.out.print(n+" ");
            }
            else
            {
                n=(3*n)+1;
                System.out.print(n+" ");
            }
        }
        System.out.println("\nthere were "+(counter+1)+" terms in the sequence.");
    }
}
