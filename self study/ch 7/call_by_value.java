public class call_by_value {
    static void swap(int a,int b)
    {
        int temp;
        temp=a;
        a=b;
        b=temp;
    }
    
    public static void main(String[] args) {
        int a=10;
        int b=15;
        System.out.println("Before calling the method a & b= "+a+" "+b);
        swap(a, b);
        System.out.println("After calling the method a & b= "+a+" "+b);

        //another way of swapping
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println(a+" "+b);
    }
}
