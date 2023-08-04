import java.util.Scanner;

public class _03_practiceProblem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String str=sc.nextLine();
    
        sc.close();

        System.out.println("Hello " +str+", have a good day");
    }
}
