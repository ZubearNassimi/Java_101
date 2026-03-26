package Lessons.arrays;

public class array28
{

    public static void main(String args [ ])
    {
        int matrix [ ] [ ] = { {1,2,3}, {5,9 }, {9,7,8,3 }, {7,9 } };

        //Printing Matrix
        for (int i=0; i<matrix.length; i++)
        {
            System.out.println();
            for (int j=0; j<matrix[i].length;j++)
            {
                //System.out.print (matrix[i][j] + "\t ");
                System.out.print ("Size = " + matrix[i].length );
            }
        }
    }
}
