package Assignments.Products;

public class Product
{
    private String name;
    private double price;


    public Product(String name, double price)
    {
        this.name = name;
        this.price = price;

    }
    public Product()
    {
        this.name = "";
        this.price = 0;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return this.name;
    }
    public void setPrice(double price)
    {
        this.price = price;
    }
    public double getPrice()
    {
        return this.price;
    }

    public double discount()
    {
        return (this.price - 5.0);
    }

    public String toString()
    {
        return ("name = "+this.name+", price = $"+this.price);
    }
}
