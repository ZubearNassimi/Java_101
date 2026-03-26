public class Circle

{

    private double radius;

    private String color;

    public Circle (double r, String s)

    {

        radius = r;

        color = s;

    }



    public double computeArea()

    {

        return Math.PI * Math.pow(radius, 2);

    }

    public double computeDiameter()

    {

        return 2*radius;

    }

    public double computePerimeter()

    {

        return 2*Math.PI * radius;

    }

    public String toString()

    {

        return ("Radius: " + radius + " Color: " + color);

    }

}