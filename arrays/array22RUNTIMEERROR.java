package Lessons.arrays;

public class array22RUNTIMEERROR
{
    static int targetArray[];
    public static void main(String[]args)
    {
        int[] sourceArray={2,3,1,5,10};

        System.arraycopy (sourceArray,0,targetArray,0,sourceArray.length);

        System.out.println("sourceArray"+"\t"+"targetArray");

        for (int i=0;i<sourceArray.length;i++)
            System.out.println(sourceArray[i]+"\t\t\t"+targetArray[i]);

        System.out.println();
        System.out.println("sourceArray"+"\t"+"targetArray");

        for (int i=0;i<sourceArray.length;i++)
        {
            targetArray[i] = 100;
            System.out.println(sourceArray[i] + "\t\t\t" + targetArray[i]);
        }
        System.out.println(sourceArray);
        System.out.println(targetArray);
    }
}
