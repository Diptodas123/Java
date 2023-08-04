import java.util.Scanner;

public class _05_practiceProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a num: ");

        boolean bool =sc.hasNextInt();
        System.out.println(bool);
        
        sc.close();
    }
}
