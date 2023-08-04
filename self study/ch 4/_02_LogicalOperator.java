import java.util.Scanner;

public class _02_LogicalOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age == 18) 
        {
            System.out.println("You're going to be adult!");
        } 
        else if ((age >= 23) && (age <= 59)) 
        {
            System.out.println("Enjoy your work life!!");
        } 
        else if((age >= 19) && (age <= 22)) 
        {
            System.out.println("Work on your skills to get a job!!");
        }
        else if (age >= 60) 
        {
            System.out.println("You're going to retire now!!");
        } 
        else 
        {
            System.out.println("Enjoy your life!!");
        }
        sc.close();
    }
}
