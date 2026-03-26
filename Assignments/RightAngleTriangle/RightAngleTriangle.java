package Assignments.RightAngleTriangle;

public class RightAngleTriangle
{
    private double base; //instance variables
    private double height;

    public RightAngleTriangle(double b, double h) //Constructor with 2 arguments
    {
        base = b;
        height = h;
    }
    public RightAngleTriangle() // default constructor
    {
        base = 1;
        height = 1;
    }

    public void setBase(double b) //setter method for base property
    {
        base = b;
    }
    public double getBase() //getter method for base property
    {
        return base;
    }
    public void setHeight(double h) //setter method for height property
    {
        height = h;
    }
    public double getHeight() //getter method for height property
    {
        return height;
    }
    public void setBaseHeight(double b, double h) //setter method for base and height properties
    {
        base = b;
        height = h;
    }
    public double computeArea() //method that computes area of a right angle triangle
    {
        return (base * height) / 2 ;
    }
    public double computePerimeter() //method that computes perimeter of a right angle triangle
    {
        return base + height + Math.sqrt( (Math.pow(base,2)) + (Math.pow(height,2)) );
    }
    public String toString() //modifying .toString() method from Object class
    {
        return ("Base is: " +base+" and Height is: "+height);
    }
    public boolean equals(Object obj) //modifying .equals() method from Object class (default value always false)
    {
        RightAngleTriangle t = (RightAngleTriangle) obj;
        return (this.getBase() == t.getBase() && this.getHeight() == t.getHeight());
    }
}