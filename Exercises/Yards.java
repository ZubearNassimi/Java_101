package Exercises;
//Problem 9 Yards.java
//displays the floor space of a room and price of
//carpeting in square yards

public class Yards {
    public static void main(String[] args){
        int length,width,price;
        length=25;
        width=42;
        price=8;
        System.out.println("The floor space is "
                +(length*width)
                +" square yards");

        System.out.println("The price for carpet is $"
                +(length*width)*price);

    }

}
