public class test1
{
    public static void main(String[]args)
    {
        int number =5;
        int inc = method1(number);
        method2(number,inc);
        System.out.println("Done");
    }
    public static int method1(int value)
    {
        int retValue = 0;
        if (value%2==0)
            retValue =1;
        else
            retValue =2;
        return retValue;
    }
    public static void method2(int n,int inc)
    {
        for (int i=1; i<=n; i+=inc)
            System.out.println(i);
    }
}
