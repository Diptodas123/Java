class A 
{
    void show1()
    {
        System.out.println("A");
    }
}
class B extends A
{
    void show2()
    {
        System.out.println("B");
    }
}
class C extends A
{
    void show3()
    {
        System.out.println("C");
    }
}
public class HierarchicalInteritance {
    public static void main(String[] args) {
        B obj1= new B();
        C obj2= new C();

        obj1.show2();
        obj1.show1();

        obj2.show3();
        obj2.show1();
    }

}
