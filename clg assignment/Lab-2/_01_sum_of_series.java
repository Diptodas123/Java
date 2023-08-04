import java.util.Scanner;

class _01_sum_of_series
{
    public static void main(String args[]) 
    {

        System.out.print("Enter the value of n: ");

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        sc.close();                             //closing sc

        int sum = 0;

        for (int i = 1; i <= n; i++) 
        {
            if (i % 2 == 0) 
            {
                sum = sum - i;
            } 
            else
            {
                sum = sum + i;
            }
        }
        System.out.println("\nSum of series is= " + sum);
    }
}
