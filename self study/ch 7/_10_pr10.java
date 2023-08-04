import java.util.Scanner;
public class _10_pr10 {

    static int sum(int n)
    {   
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum+=i;
        }
        return sum;
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
