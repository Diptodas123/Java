import java.util.Scanner;

class C {
    String name;

    public void method() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What's your name? ");
        this.name = sc.nextLine();
        System.out.println("Hi " + this.name + " (by using sout)");
    }
}

public class _02_pr02 {
    public static void main(String[] args) {
        C c = new C();
        c.method();
    }

}
