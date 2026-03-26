package Assignments;
/*Zubear Nassimi 991628529
PROG10082 Class 1209_24071
instructor - Satyendra Narayan
wednesday December 02,2020
Assignments.Assignments.CoinFlip.CoinFlip.java
This program displays the result of a 100 coin flips*/

public class CoinFlip
{

    //sir i tried to put this code into separate methods like you asked on the assignment but i could not do it.
    //i need to study methods some more. i just don't know how to make it work. sorry

    public static void main(String[]args)
    {
        int matrix [][]= new int[10][10];

        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[i].length;j++)
            {
                matrix[i][j]=(int)(Math.random()*2);
            }
        }

        //Printing Matrix

        int counterH=0;
        int counterT=0;

        for(int i=0; i<matrix.length;i++) // control row
        {
            for (int j=0; j<matrix[i].length;j++) //display column
            {
                if (matrix[i][j]==1){
                    System.out.print("heads\t");
                    counterH += 1;
                }
                else{
                    System.out.print("tails\t");
                    counterT += 1;
                }
            }
            System.out.println();
        }
        System.out.println("\nIn 100 flip of the coin there were "+counterH+" Heads and "+counterT+" Tails.");
    }
}
