class A
{
    int sum(int a,int b)
    {
        return a+b;
    }
    int diff(int a,int b)
    {
        return a-b;
    }
}
class B extends A
{
    int mul(int a,int b)
    {
        return a*b;
    }
    int div(int a,int b)
    {
        return a/b;
    }
}
public class Demo {
    B ob=new B();
    void display(int a,int b)
    {
        System.out.println("Sum: "+ob.sum(a, b));
        System.out.println("Sub: "+ob.diff(a, b));
        System.out.println("Mul: "+ob.mul(a, b));
        System.out.println("Div: "+ob.div(a, b));
    }
    public static void main(String[] args) {
        Demo obj=new Demo();
        obj.display(10, 5);
    }
}
