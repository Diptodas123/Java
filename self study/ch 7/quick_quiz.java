import java.util.Scanner;

public class quick_quiz {
    static int factorial(int n)
    {
        if(n==0 || n==1)        //-> base condition
        {
            return 1;       //as factorial of 0 is also 1
        }
        else
        {
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter a number: ");
        int n=sc.nextInt();

        int result=factorial(n);

        System.out.print("Factorial of "+n+" is= "+result);

        sc.close();
    }
}
