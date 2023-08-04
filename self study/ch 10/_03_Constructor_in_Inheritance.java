class Base1
{
    Base1()
    {
        System.out.println("I am a base class constructor");
    }
}
class Derived1 extends Base1
{
    Derived1()
    {
        System.out.println("I am a derived class constructor");
    }
}
public class _03_Constructor_in_Inheritance {
    public static void main(String[] args) {
        Derived1 d=new Derived1();
        d.equals(d);
    }
}
