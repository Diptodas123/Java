class A
{
    void show()
    {
        System.out.println("Super");
    }
}
class B extends A
{
    void show1()
    {
        System.out.println("Subclass");
    }
}
class Test 
{
    public static void main(String[] args) {
        A ob1=new A();
        B ob2=new B();
        
        ob1.show();
        ob2.show1();
        ob2.show();
    }
}
