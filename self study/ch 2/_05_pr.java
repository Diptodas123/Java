import java.util.Scanner;

public class _05_pr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int compNum=10;
        System.out.println("Enter a num: ");
        int userNum=sc.nextInt(); 
        System.out.println(userNum>compNum);
        sc.close();
    }
}
