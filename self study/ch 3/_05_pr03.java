import java.util.Scanner;

public class _05_pr03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name=sc.nextLine();

        String letter="Dear <|name|>, thanks a lot!!";

        letter=letter.replace("<|name|>", name);

        System.out.println(letter);
        sc.close();
    }
}
