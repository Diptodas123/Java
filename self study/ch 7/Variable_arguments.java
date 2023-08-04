
public class Variable_arguments {
    static int sum(int ...arr)         // arr is available here as int arr[]
    {   
        int sum=0;
        for(int elements: arr)
        {
            sum += elements;
        }
        return sum;
    }
    public static void main(String[] args) {
        int result=sum(10,20,30);
        System.out.println(result);
    }
}
