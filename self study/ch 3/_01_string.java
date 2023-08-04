import java.util.Scanner;

public class _01_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        //using string as class
        String str1=new String("Hi,");     

        //using as datatype
        String str2="its";                //here str is reference and Harry is obj

        String str3="Dipto";

        //printing using printf method
        System.out.println(str1);

        //printing using printf method
        System.out.printf("%s\n", str2);

        //printing using format method
        System.out.format("%s", str3);

        sc.close();
    }
}
