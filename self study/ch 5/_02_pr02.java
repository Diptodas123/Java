import java.util.Scanner;

public class _02_pr02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        int sum = 0;
        System.out.print("Enter the range: ");
        int range = sc.nextInt();

        int i = 1;

        while (i <= range) 
        {
            if (i % 2 == 0) 
            {
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum of even numbers upto " + range + " is= " + sum);
        sc.close();
    }
}
