class Base
{
    int x;
    void setX(int n)
    {   
        this.x=n;
    }
    int getX()
    {
        return x;
    }
}
class Derived extends Base
{
    int y;
    void setY(int n)
    {   
        this.y=n;
    }
    int getY()
    {
        return y;
    }
}
public class _01_Inheritance {
    public static void main(String[] args) {
        Base ob1=new Base();
        Derived ob2=new Derived();
        ob1.setX(10);
        System.out.println(ob1.getX());
        ob2.setX(7);
        ob2.setY(15);
        System.out.println(ob2.getX());
        System.out.println( ob2.getY());
        //obj of Derived class can access all the members of both classes 
        //but obj of Base class cannot access the members of Derived class
    }
}
