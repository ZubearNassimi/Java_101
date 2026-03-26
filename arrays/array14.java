package Lessons.arrays;

public class array14
{
    static int i;
    static boolean myList[]=new boolean[10]; // class variables must be static
    public static void main(String[]args)
    {
        //int i; //local array never initialized to default value

        System.out.println(myList);

        System.out.println(myList[0]);
        System.out.println(myList[9]);
        System.out.println("i= "+i);
        System.out.println("Array Size= "+myList.length);
    }
}
//array always initialized to default values. whether local or class level
