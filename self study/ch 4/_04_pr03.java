import java.util.Scanner;

public class _04_pr03 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your income in lakhs(inr): ");
        double income=sc.nextDouble();

        double tax=0; 
        if(income<250000)
        {
            System.out.println("No tax to pay");
        }
        else if(income>=250000 && income<500000)
        {
            tax = tax+(income-250000)*5.0f/100.0f;
            System.out.printf("Total tax to be paid: %.2f inr",tax);
        }
        else if(income>=500000 && income<1000000)
        {
            tax = tax+(500000-250000)*5.0f/100.0f;      
            tax = tax+(income-500000)*20.0f/100.0f;
            System.out.printf("Total tax to be paid: %.2f inr",tax);
        }
        else if(income>=1000000)
        {
            tax = tax+(500000-250000)*5.0f/100.0f;
            tax = tax+(1000000-500000)*20.0f/100.0f;
            tax = tax+(income-1000000)*30.0f/100.0f;
            System.out.printf("Total tax to be paid: %.2f inr",tax);
        }

        sc.close();
    }
}
