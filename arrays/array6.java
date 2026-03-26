package Lessons.arrays;

public class array6
{
    public static void main(String[]args)
    {
        String myList[]=new String[10];
        System.out.println(myList);

        for (int i =0; i<myList.length;i++) //printing array content
            System.out.println(myList[i]);
    }
}
//String is an object, it is reference type, thus value is null
