package Assignments.Rectangle;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Sunday December 6,2020
Assignment Assignments.Rectangle class
Assignments.TestRectangle.java
This program shows the use of classes, methods, objects, setter getter method, .equals() method and passing objects to an array */

public class TestRectangle
{
    /**@author Zubear Nassimi
     * version 1.0*/
    public static void main(String[]args)
    {
        Rectangle myRectangle = new Rectangle(); // creating first object and loading default constructor
        System.out.println("\n"+myRectangle.toString()); // printing modified .toString() method

        Rectangle mySecondRectangle = new Rectangle(15, 16); //creating second object and calling constructor with 2 arguments
        System.out.println(mySecondRectangle); //printing instance variables stored in memory of second object.

        myRectangle.setLength(13); //invoking setLength() method and changing values of instance variables stored in myRectangle object
        myRectangle.setWidth(14);
        System.out.println(myRectangle+"\n"); // printing new values now stored in memory of myRectangle

        Rectangle[] rectangleArray = new Rectangle[10]; //creating an array of size 10

        for(int i=0; i<rectangleArray.length;i++) //loading Assignments.Rectangle object into array
            rectangleArray[i] = new Rectangle(i,i);

        for(int i=0; i<rectangleArray.length; i++) //Printing Assignments.Rectangle array
            System.out.println (rectangleArray[i].toString()); //.toString() is redundant to type

        Rectangle myThirdRectangle = new Rectangle(30,50); // creating 2 new objects with identical properties.
        Rectangle myFourthRectangle = new Rectangle(30,50);

        boolean compare = myThirdRectangle.equals(myFourthRectangle); //comparing properties of both objects
        System.out.println("\n"+compare); // printing boolean value of comparison
    }
}
