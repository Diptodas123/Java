import java.util.Scanner;

public class _02_practiceProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter marks of subject1: ");
        float sub1 = sc.nextFloat();

        System.out.println("Enter marks of subject2: ");
        float sub2 = sc.nextFloat();

        System.out.println("Enter marks of subject3: ");
        float sub3 = sc.nextFloat();

        sc.close();

        float sum = sub1 + sub2 + sub3;
        float cgpa = (sum / 300) * 10;

        System.out.printf("Obtained CGPA: %.2f",cgpa);
    }
}
