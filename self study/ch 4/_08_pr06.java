import java.util.Scanner;

public class _08_pr06 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the name of a website with extension: ");
        String website=sc.nextLine();

        if(website.endsWith(".com"))
        {
            System.out.println("It is a commercial website");
        }
        else if(website.endsWith(".org")) 
        {
            System.out.println("It is an organigational website");
        }
        else if (website.endsWith(".in")) 
        {
            System.out.println("It is an Indian website");
        }
        sc.close();
    }
}
