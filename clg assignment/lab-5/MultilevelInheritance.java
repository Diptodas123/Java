class S1
{
    void show1()
    {
        System.out.println("S1");
    }
}
class S2 extends S1
{
    void show2()
    {
        System.out.println("S2");
    }
}
class S3 extends S2
{
    void show3()
    {
        System.out.println("S3");
    }
}
public class MultilevelInheritance {
    public static void main(String[] args) {
        S3 obj= new S3();
        obj.show3();
        obj.show2();
        obj.show1();
    }
}
