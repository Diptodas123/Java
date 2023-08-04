import java.util.Scanner;

public class quick_quiz2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int n;
        System.out.print("Enter the value of n: ");
        n=sc.nextInt();

        System.out.println("Natural numbers from 1 to "+n+" are: ");
        int i=1;
        do{
            System.out.print(i+", ");
            i++;
        }while(i<=n);
        sc.close();
    }
}
