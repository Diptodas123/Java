import java.util.Scanner;

class _08_pr08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter n: ");

        int n=sc.nextInt();

        int sum=0;
        for(int i=0;i<n;i++)
        {
            if(i%2==0)
            {
                sum=sum+i;
            }
        }
        System.out.println("Sum of first "+n+" even numbers is= "+sum);
        sc.close();
    }
}
