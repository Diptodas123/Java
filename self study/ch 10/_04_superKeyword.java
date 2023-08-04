class Parent
{
    Parent()
    {
        System.out.println("I am a parent class constructor");
    }
    Parent(int x)
    {
        System.out.println("I am a overloaded constructor of Parent class with Value of x= "+x);
    }
}
class Child extends Parent
{
    Child()
    {
        System.out.println("I am a child class constructor");
    }
    Child(int x,int y)
    {
        super(x);
        System.out.println("I am a overloaded constructor of Child class with Value of y= "+y);
    }
}
class GrandChild extends Child
{
    GrandChild()
    {
        System.out.println("I am a child class constructor");
    }
    GrandChild(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am a overloaded constructor of GrandChild class with Value of z= "+z);
    }
}
public class _04_superKeyword {
    public static void main(String[] args) {
        GrandChild gc=new GrandChild(4,5,6);
    }
}
