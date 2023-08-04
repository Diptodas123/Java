import java.util.Scanner;

public class _04_revnum
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = sc.nextInt();
        sc.close();

        int rem = 0, rev = 0;

        while (num > 0) 
        {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        System.out.print("Reversed num: "+rev);
    }
}
