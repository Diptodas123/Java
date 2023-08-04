import java.util.Scanner;

public class _03_mystrlen {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str = sc.nextLine();

        sc.close();
        int l=str.length();
        
        System.out.println("The lenght of the string is: " + l);
    }

}
