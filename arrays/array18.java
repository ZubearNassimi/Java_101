package Lessons.arrays;

public class array18
{
    public static void main(String[]args)
    {
        int myInt[]={10,20,30,40,50,60};
        System.out.println("Array Size= "+myInt.length);

        int sum= myInt[0] + myInt[1];
        System.out.println("sum of the first two elements= "+sum);
        System.out.println("sum of the third and fourth element= "+ (myInt[2]+myInt[3]));
        System.out.println(myInt);
        System.out.println(myInt[0]);

    }
}