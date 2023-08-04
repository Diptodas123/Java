import java.util.Scanner;

class _02_pr02 {
   
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int arr[]={1,2,3,4,5,6};
        System.out.println("Enter n: ");
        int n=sc.nextInt();

        boolean isPresent=false;        //to evaluate(initializing to false)
        int count=0;                    //to keep tracking the index
        for(int elements: arr)
        {
            if(elements==n)
            {
                isPresent=true;
                break;                 //if num is found then no need to traverse the whole array
            }
            count++;                
        }
        if(isPresent)
        {
            System.out.println(n+" is found in the array at "+count+" index");
        }
        else
        {
            System.out.println(n+" is not found in the array");
        }
        sc.close();
    }
}
