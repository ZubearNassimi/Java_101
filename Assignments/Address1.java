package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
saturday November 28,2020
Homework Lessons.Constructor.Lessons.Constructor.Person.Person.Address with 4 method types
Assignments.AddressAssignment1.java
This program displays a users address after their input, using a input and return type method*/
import java.util.*;
public class Address1
{
    //Method with input and return type
    public static String address(String a,String b,String c,String d)
    {
        return (a+"\n"+b+"\n"+c+","+d) ;
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
        System.out.println("\nYour complete address is : \n"+address(name,street,city,postal));
    }
}