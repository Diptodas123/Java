import java.util.Scanner;

class _01_sum_of_series {
    public static void main(String args[]) {
        System.out.println("Enter the value of n: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Sum of series: " + sum);
    }
}
