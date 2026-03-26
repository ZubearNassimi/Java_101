package Lessons.arrays;

public class array13
{
    static int i;
    public static void main(String[]args)
    {
        //int i; //local array never initialized to default value
        boolean myList[]=new boolean[10]; //local boolean array
        System.out.println(myList);

        System.out.println(myList[0]);
        System.out.println(myList[9]);
        System.out.println("i= "+i);
        System.out.println("Array Size= "+myList.length);
    }
}
