import java.util.Scanner;
public class _01_pr01 {

    static void mul(int n)
    {
        System.out.println("Multiplication table of "+n+" is: ");
        for(int i=1;i<=10;i++)
        {
            System.out.println(n+" X "+i+" = "+n*i);
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        mul(num);

        sc.close();
    }
}
