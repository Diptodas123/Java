import java.util.Scanner;

public class _04_pr02 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=sc.nextLine();

        System.out.println(str.replace(" ", "_"));

        sc.close();
    }
}
