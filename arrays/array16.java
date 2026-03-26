package Lessons.arrays;

public class array16
{
    public static void main(String[]args)
    {
        int myInt[]=new int[5]; //assigning array into loop manually
        myInt[0]=10;
        myInt[1]=20;
        myInt[2]=30;
        myInt[3]=40;

        for(int i=0;i<myInt.length;i++)
            System.out.println(myInt[i]);


        System.out.println ("average = "+ (myInt[0]+ myInt[1]+ myInt[2]+ myInt[3]+ myInt[4])/myInt.length);

        int sum=0;
        for(int i=0;i<myInt.length;i++)
            sum=sum+myInt[i];

        System.out.println("average = "+sum/myInt.length);
    }
}
