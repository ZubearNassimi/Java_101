import java.util.*;
public class exam
{
    public static void main (String[]args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many rows for the pattern?: ");
        int rows = scanner.nextInt();

        for (int i=0; i<4; i++)
        {
            System.out.println("* * * *");
        }
    }
}
