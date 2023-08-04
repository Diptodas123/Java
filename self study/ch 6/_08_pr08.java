import java.util.Scanner;

public class _08_pr08 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the num of elements: ");
        int numofElements=sc.nextInt();
        int arr[]=new int[numofElements];

        for(int i=0;i<arr.length;i++)
        {
            System.out.println("Enter the value of arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }

        boolean isSorted=true;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                isSorted=false;
                break;
            }
        }
        if(isSorted)
        {
            System.out.println("Array is in sorted order");
        }
        else
        {
            System.out.println("Array is not in sorted order");
        }

        sc.close();
    }
}
