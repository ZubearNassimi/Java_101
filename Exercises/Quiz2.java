package Exercises;

public class Quiz2
{
    public static void main(String[]args){

        System.out.printf("%3d\n",5);
        System.out.printf("%3d\n",12345);
        System.out.printf("%5.2f\n",7.24);
        System.out.printf("%5.2f\n",7.277);
        System.out.printf("%5.2f\n",123.456);
        System.out.printf("%5.2f\n",123.4);
        System.out.printf("%-5.2f\n",7.277);
        System.out.printf("%-5.2f\n\n",123.456);

        System.out.printf("amount is %f %e\n", 32.32, 32.32);
        System.out.printf("amount is %5.2f  %5.4e\n", 32.327, 32.32);
        System.out.printf("%6b\n", (1 > 2));
        System.out.printf("%6s\n", "Java");
        System.out.printf("%-6b%s\n", (1 > 2), "Java");
        System.out.printf("%6b%-8s\n\n", (1 > 2), "Java");

        System.out.printf("Hello%2d and %6s%n",8,"HI!!!");
        System.out.printf("Hi,%s%4d%n","Hello",88);
        System.out.printf("Hi,%d%4.2f%n",8,5.556);
        System.out.printf("Hi,%-4s&%6.2f%n","Hi",5.5);
        System.out.printf("Hi, Hi, %.4f%n", 5.56);

        System.out.format("A is equal to %d%n%n",1);

        long n = 461012;
        System.out.format("%d%n", n);
        System.out.format("%08d%n", n);
        System.out.format("%+8d%n", n);
        System.out.format("%,8d%n", n);
        System.out.format("%+,8d%n%n", n);

        double pi = Math.PI;
        System.out.format("%f%n", pi);
        System.out.format("%.3f%n", pi);
        System.out.format("%10.3f%n", pi);
        System.out.format("%-10.3f%n", pi);

    }
}
