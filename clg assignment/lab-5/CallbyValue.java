class Test
{
    void display(int a,int b)
    {
        a*=2;
        b/=2;
    }
}
public class CallbyValue {
    public static void main(String[] args) {
        int a=10,b=20;
        Test ob= new Test();
        System.out.println("a & b before call: "+a+" "+b);
        ob.display(a, b);
        System.out.println("a & b after call: "+a+" "+b);
    }
}
