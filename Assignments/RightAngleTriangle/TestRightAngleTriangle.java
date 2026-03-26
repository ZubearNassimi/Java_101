package Assignments.RightAngleTriangle;/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
Friday December 11,2020
Assignment Assignments.RightAngleTriangle.RightAngleTriangle class
Assignments.RightAngleTriangle.TestRightAngleTriangle.java
This program shows the use of classes, methods, objects, setter getter method, .equals() method and passing objects to an array */

public class TestRightAngleTriangle
{
    /**@author Zubear Nassimi
     * version 1.0*/

    public static void main(String[]args)
    {
        RightAngleTriangle myTriangle = new RightAngleTriangle(); // creating first object and loading default constructor
        System.out.println("\n"+myTriangle.toString()); // printing modified .toString() method

        RightAngleTriangle mySecondTriangle = new RightAngleTriangle(15, 16); //creating second object and calling constructor with 2 arguments
        System.out.println(mySecondTriangle); //printing instance variables stored in memory of second object.

        myTriangle.setBase(13); //invoking setLength() method and changing values of instance variables stored in myTriangle object
        myTriangle.setHeight(14);
        System.out.println(myTriangle+"\n"); // printing new values now stored in memory of myTriangle

        RightAngleTriangle[] triangleArray = new RightAngleTriangle[10]; //creating an array of size 10

        for(int i=0; i<triangleArray.length;i++) //loading Assignments.RightAngleTriangle.RightAngleTriangle object into array
            triangleArray[i] = new RightAngleTriangle(i,i);

        for(int i=0; i<triangleArray.length; i++) //Printing Assignments.RightAngleTriangle.RightAngleTriangle array
            System.out.println (triangleArray[i].toString()); //.toString() is redundant to type

        RightAngleTriangle myThirdTriangle = new RightAngleTriangle(30,50); // creating 2 new objects with identical properties.
        RightAngleTriangle myFourthTriangle = new RightAngleTriangle(30,50);

        boolean compare = myThirdTriangle.equals(myFourthTriangle); //comparing properties of both objects
        System.out.println("\n"+compare); // printing boolean value of comparison
    }
}
