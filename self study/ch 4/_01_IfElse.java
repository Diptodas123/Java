import java.util.Scanner;

public class _01_IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age=sc.nextInt();

        if(age>18)
        {
            System.out.println("You can vote!!");
        }
        else
        {
            System.out.println("You can't vote!!");
        }
        
        sc.close();
    }
}
