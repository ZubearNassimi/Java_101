package Lessons.arrays;

public class array27Multidimensional //array of another array
{
    public static void main(String[]args)
    {
        int matrix [][]= new int[10][10];

        for (int i=0; i<matrix.length; i++)   //loading
        {
            for (int j=0; j<matrix[i].length;j++)
            {
                matrix[i][j]=(int)(Math.random()*1000);
            }
        }

        //Printing Matrix

        for(int i=0; i<matrix.length;i++) // control row
        {
            for (int j=0; j<matrix[i].length;j++) //display column
            {
                System.out.print(matrix[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
