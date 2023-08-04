import java.util.Scanner;

public class _02_marks {
    public static void main(String args[]) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the total marks of the exammination: ");
        float total = sc.nextInt();

        System.out.println("Enter marks of sub1: ");
        float s1 = sc.nextFloat();
        System.out.println("Enter marks of sub2: ");
        float s2 = sc.nextFloat();
        System.out.println("Enter marks of sub3: ");
        float s3 = sc.nextFloat();
        System.out.println("Enter marks of sub4: ");
        float s4 = sc.nextFloat();
        System.out.println("Enter marks of sub5: ");
        float s5 = sc.nextFloat();
        sc.close();

        float sum = s1 + s2 + s3 + s4 + s5;
        float result = (sum * 100) / total;

        System.out.printf("Total marks obtained: %.2f\n", sum);
        System.out.printf("Percentage: %.2f%%", result);

    }
}
