abstract class Parent
{
    public void method1()
    {
        System.out.println("Method 1");
    }
    abstract public void greet();       //all abstract methods should be defined in every subclasses of that partucalr abstract super class
}
class Child extends Parent
{
    @Override
    public void greet()     //implementing the greet method & Overriding
    {
        System.out.println("Hello");
    }
    public void method2()
    {
        System.out.println("Method 2");
    }
}
public class _01_Abstract_class {
    public static void main(String[] args) {
        Child ch=new Child();
        ch.greet();
        ch.method1();
        ch.method2();

        //Parent p=new Parent();  //->will throw error as abtract class cannot be instantiated

        Parent p=new Child();   //->allowed(using dynamic method dispatch) defining ref var of a abstract class to refer to a object of its subclass

        p.greet();
        p.method1();
    }
}
