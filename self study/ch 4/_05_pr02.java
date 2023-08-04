import java.util.Scanner;

public class _05_pr02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the marks of sub1: ");
        float sub1 = sc.nextFloat();

        System.out.println("Enter the marks of sub2: ");
        float sub2 = sc.nextFloat();

        System.out.println("Enter the marks of sub3: ");
        float sub3 = sc.nextFloat();

        float avg = (sub1 + sub2 + sub3) * 100.0f / 300.0f;

        System.out.println("Your overall percentage is: " + avg + "%");

        if ((avg >= 40) && (sub1 >= 33) && (sub2 >= 33) && (sub3 >= 33)) 
        {
            System.out.println("Congratulations you're passed!!");
        } 
        else
        {
            System.out.println("Sorry, you haven't passed, Work Hard!!");
        }

        sc.close();
    }
}
