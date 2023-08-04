import java.util.Scanner;;

public class _05_str {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter a string: ");
        String str=sc.next();
        
        String even="";
        String odd="";
        sc.close();
        
        char arr[]=str.toCharArray();
        for (int i = 0; i < (arr.length); i++) {
            if(i%2==0)
            {   
                even=even+arr[i];
            }
            else
            {
                odd=odd+arr[i];
            }
        }
        
        System.out.println("\n__________OUTPUT__________");
        System.out.println("Even position: "+even+"\nOdd position: "+odd);
    }
}
