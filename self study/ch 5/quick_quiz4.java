import java.util.Scanner;
public class quick_quiz4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        
        System.out.println("Natural numbers upto "+n+" in reverse order are: ");
        for(int i=n;i>=1;i--)
        {
            System.out.print(i+", ");
        }
        sc.close();
    }
}
