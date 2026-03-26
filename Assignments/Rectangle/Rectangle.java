package Assignments.Rectangle;

public class Rectangle
{
    private double length; //instance variables
    private double width;

    public Rectangle(double l, double w) //Constructor with 2 arguments
    {
        length = l;
        width = w;
    }
    public Rectangle() // default constructor
    {
        length = 1;
        width = 1;
    }

    public void setLength(double l) //setter method for length property
    {
        length = l;
    }
    public double getLength() //getter method for length property
    {
        return length;
    }
    public void setWidth(double w) //setter method for width property
    {
        width = w;
    }
    public double getWidth() //getter method for width property
    {
        return width;
    }
    public void setLengthWidth(double l, double w) //setter method for length and width properties
    {
        length = l;
        width = w;
    }
    public double computeArea() //method that computes area of rectangle
    {
        return (length * width);
    }
    public double computePerimeter() //method that computes perimeter of rectangle
    {
        return ((2 * length) + (2 * width));
    }
    public String toString() //modifying .toString() method from Object class
    {
        return ("Length is: " +length+" and Width is: "+width);
    }
    public boolean equals(Object obj) //modifying .equals() method from Object class (default value always false)
    {
        Rectangle r = (Rectangle) obj;
        return (this.getLength() == r.getLength() && this.getWidth() == r.getWidth());
    }
}
