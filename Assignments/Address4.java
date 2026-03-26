package Assignments;

/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
saturday November 28,2020
Homework Lessons.Constructor.Lessons.Constructor.Person.Person.Address with 4 method types
Assignments.AddressAssignment4.java
This program displays a users address after their input, using a no return type and no Input method*/
import java.util.Scanner;
public class Address4
{
    private static String a;
    private static String b;
    private static String c;
    private static String d;

    //Method with no Input and no Return type
    public static void address ()
    {
        System.out.println("\nYour complete address is : \n"+a+"\n"+b+"\n"+c+"\n"+d);
    }
    public static void main(String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first and last name : ");
        String name = scanner.nextLine();
        System.out.print("Enter your street number and name : ");
        String street = scanner.nextLine();
        System.out.print("Enter your city and province name : ");
        String city = scanner.nextLine();
        System.out.print("Enter your postal code : ");
        String postal = scanner.nextLine();

        a=name;
        b=street;
        c=city;
        d=postal;

        address();
    }
}