import java.util.Scanner;

public class _01_pr01 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("enter the num of rows: ");
        int row=sc.nextInt();

        for (int i = row; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }

        sc.close();
    }
}
