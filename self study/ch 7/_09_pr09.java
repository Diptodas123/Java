
import java.util.Scanner;
public class _09_pr09 {

    static float converter(float celsius)
    {
        float fahrenheit=0;
        fahrenheit=(1.8f*celsius)+32;

        return fahrenheit;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter temperature in celsius: ");
        float celsius=sc.nextFloat();
        float fahrenheit=converter(celsius);
        System.out.println(celsius+" celsius= "+fahrenheit +" fahrenheit");

        sc.close();
    }
}
