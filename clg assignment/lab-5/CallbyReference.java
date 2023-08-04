class Test1
{
    int a,b;
    Test1(int i,int j)
    {
        a=i;
        b=j;
    }
    void display(Test1 o)
    {
        o.a*=2;
        o.b/=2;
    }
}
public class CallbyReference {
    public static void main(String[] args) {
        Test1 ob= new Test1(10, 20);
        System.out.println("a & b before call: "+ob.a+" "+ob.b);
        ob.display(ob);
        System.out.println("a & b after call: "+ob.a+" "+ob.b);
    }
}
