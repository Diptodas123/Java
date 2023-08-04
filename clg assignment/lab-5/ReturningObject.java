class Test2
{
    int a;
    Test2(int i)
    {
        a=i;
    }
    Test2 incrbyTen()
    {
        Test2 temp= new Test2(a+10);
        return temp;
    }
}
public class ReturningObject {
    public static void main(String[] args) {
        Test2 ob1= new Test2(10);
        Test2 ob2;
        ob2=ob1.incrbyTen();
        System.out.println("After 1st increment: "+ob2.a);
        ob2=ob2.incrbyTen();
        System.out.println("After 2nd increment: "+ob2.a);
    }
}
