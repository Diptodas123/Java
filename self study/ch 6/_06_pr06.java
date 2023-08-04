import java.util.Scanner;

public class _06_pr06 {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of eleements: ");
        int numofElements = sc.nextInt();
        int arr[] = new int[numofElements];

        System.out.println("Enter the elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print("Enter the value of arr[" + i + "]: ");
            arr[i] = sc.nextInt();
        }
        int maximum=Integer.MIN_VALUE;          //initializng to MIN_VALUE
        for(int elements: arr)
        {
            if(maximum<elements)
            {
                maximum=elements;
            }
        }
        System.out.println("Maximum element is: " + maximum);
        sc.close();
    }
}
