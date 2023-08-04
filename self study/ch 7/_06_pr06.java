import java.util.Scanner;
public class _06_pr06 {

    static int average(int ...arr)
    {
        int sum=0;
        int avg=0;
        for(int elements: arr)
        {
            sum=(sum+elements);
        }
        avg=sum/arr.length;
        return avg; 
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int avg=average(20,25,30,80);

        System.out.println("The average is: "+avg);
        sc.close();
    }
}
