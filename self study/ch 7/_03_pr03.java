import java.util.Scanner;

public class _03_pr03 {
    static int sum(int n)
    {
        if(n==0 || n==1)
        {
            return n;
        }
        else
        {
            return n+sum(n-1);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num=sc.nextInt();
        System.out.println("Sum of "+num+" natural numbers is= "+sum(num));

        sc.close();
    }
}
