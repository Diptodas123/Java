import java.util.Scanner;

public class _07_pr07 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int numofElements = sc.nextInt();
        int arr[] = new int[numofElements];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter the value of arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        int minimum=Integer.MAX_VALUE;
        for(int elements: arr) 
        {
            if(minimum>elements)
            {
                minimum=elements;
            }
        }
        System.out.println("minimum element is: " + minimum);
        sc.close();
    }
}
