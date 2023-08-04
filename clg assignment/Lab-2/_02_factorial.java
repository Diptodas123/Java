import java.util.Scanner;

class _02_factorial 

{
    public static void main(String[] args) 
    {
        System.out.print("Enter a num: ");

        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        sc.close();

        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.printf("Factorial of %d is= %d",num,fact);
    }
}
