import java.util.Scanner;

class _06_pr06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num=sc.nextInt();

        int i=1,fact =1;
        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of "+num+" is= "+fact);

        sc.close();
    }
}
