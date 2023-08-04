import java.util.Scanner;

public class _03_pr01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str=sc.nextLine();

        String lcase=str.toLowerCase();

        System.out.println(lcase);

        sc.close();

        //Manual way
        /* 
        
        char arr[]=str.toCharArray();
 
        for (int i = 0; i < arr.length; i++) 
        {
            if ((arr[i]>=65) && (arr[i]<=90)) 
            {
                System.out.printf("%c",arr[i]+32);
            }
            else
            {
                System.out.printf("%c",arr[i]);
            }
         }
         */
    }
}
