import java.util.Scanner;

public class _05_pr05 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int numofElements=sc.nextInt();

        int arr[]=new int[numofElements];
        for(int i=0;i<arr.length;i++)
        {
            System.out.print("Enter the value of arr["+i+"]: ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Array in original order:");
 
        for(int elements: arr)
        {
            System.out.print(elements+" ");
        }
        
        //reversing the array
        for(int i=0;i<arr.length/2;i++)
        {
            int temp=arr[arr.length-i-1];
            arr[arr.length-i-1]=arr[i];
            arr[i]=temp;
        }
        System.out.println("\nArray in reversed order:");

        for(int elements: arr)
        {
            System.out.print(elements+" ");
        }
        sc.close();
    }
}
