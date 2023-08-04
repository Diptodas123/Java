import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("How many number of terms to be generated: ");

        int n=sc.nextInt();
        int x=0;
        int y=1;
        System.out.println("Fibonacci series up to "+n+" terms: ");
        System.out.print(x+" "+y+" ");
        int z;
        for(int i=2;i<=n;i++)
        {
            z=x+y;
            System.out.print(z+" ");
            x=y;
            y=z;
        }
        sc.close();
    }
}
