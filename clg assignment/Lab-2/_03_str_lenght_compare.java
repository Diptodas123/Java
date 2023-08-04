import java.util.Scanner;

public class _03_str_lenght_compare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter 1st String: ");
        String s1=sc.nextLine();
        System.out.print("Enter 2nd String: ");
        String s2=sc.nextLine();

        sc.close();

        if (s1.length()>s2.length()) 
        {
            System.out.println("S1 has the maximum lenght");
        }
        else if (s1.length()==s2.length()) 
        {
            System.out.println("Both strings are equal in lenght");
        }
        else
        {
            System.out.println("S2 has the maximum lenght");
        }
    }
    
}
