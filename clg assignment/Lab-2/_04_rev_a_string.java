import java.util.Scanner;

public class _04_rev_a_string 
{
    public static void main(String[] args) 
    {   
        System.out.print("Enter a String: ");
        Scanner sc=new Scanner(System.in);

        String str=sc.next();
        sc.close();

        char arr[]=str.toCharArray();
        for (int i = (arr.length-1); i >= 0; i--) 
        {
            System.out.print(arr[i]);
        }
    }
}
// class GFG {
    // public static void main (String[] args) {
        // 
        // String str= "Geeks", nstr="";
        // char ch;
        // 
    //   System.out.print("Original word: ");
    //   System.out.println("Geeks"); //Example word
        // 
    //   for (int i=0; i<str.length(); i++)
    //   {
        // ch= str.charAt(i); //extracts each character
        // nstr= ch+nstr; //adds each character in front of the existing string
    //   }
    //   System.out.println("Reversed word: "+ nstr);
    // }
// }
