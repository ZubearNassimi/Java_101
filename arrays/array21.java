package Lessons.arrays;

public class array21
{
    public static void main(String args [ ])
    {
        int[ ] sourceArray = {2, 3, 1, 5, 10};//creating, and loading array

        int[ ] targetArray = new int[sourceArray.length];	//Creating 5 elements long array

        System.arraycopy(sourceArray, 0, targetArray, 0,sourceArray.length);

        System.out.println("sourceArray" + "\t" + "targetArray");

        for (int i = 0; i < sourceArray.length; i++)
            System.out.println(sourceArray[i] + "\t\t" + targetArray[i]);
    }

}
