import java.util.Scanner;

public class _02_palindrome 
{
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        sc.close();

        int temp = num, rem = 0, rev = 0;

        while (num > 0) 
        {
            rem = num % 10;
            rev = (rev * 10) + rem;
            num /= 10;
        }
        if (temp == rev) 
        {
            System.out.println("It is a palindrome num");
        } 
        else
        {
            System.out.println("It is not a palindrome num");
        }
    }
}
