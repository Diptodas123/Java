import java.util.Scanner;

public class _07_pr05 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a year: ");
        int year = sc.nextInt();

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) 
        {
            System.out.println("Its a leap year!!");
        } 
        else 
        {
            System.out.println("Its not a leap year!!");
        }

        sc.close();
    }
}
