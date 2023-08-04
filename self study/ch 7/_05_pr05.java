
import java.util.Scanner;
public class _05_pr05 {
    static int fibonacci(int num)
    {
        if(num==1 )
        {
            return 0;
        }
        else if(num== 2)
        {
            return 1;
        }
        else
        {
            return fibonacci(num-1)+fibonacci(num-2);
        }

        /*for example
            fibonacci(4)=fibonacci(3)+fibonacci(2)=2+1=3
            fibonacci(3)=fibonacci(2)+fibonacci(1)=1+1=2     ->        fibonacci 0 will return 0
            fibonacci(2)=fibonacci(1)+fibonacci(0)=1+0=1     ->        fibonacci 1 will return 1 and fibonacci 0 will return 0= 1+0=1
        */
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the range of fibonacci series: ");
        int num=sc.nextInt();

        System.out.println("Fibonacci series up to "+num+" is= "+fibonacci(num));
        sc.close();
    }
}
