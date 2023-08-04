class Test
{
    int a,b;
    Test(int i, int j)
    {
        a=i;
        b=j;
    }
    void swap(Test o)
    {
        int temp=o.a;
        o.a=o.b;
        o.b=temp;
    }
}
public class call_by_reference {
    public static void main(String[] args) {
        int i=10;
        int j=20;
        Test obj=new Test(i, j);

        System.out.println("Before calling the method i & j= "+obj.a+" "+obj.b);
        obj.swap(obj);
        System.out.println("After calling the method i & j= "+obj.a+" "+obj.b);
    }
}
