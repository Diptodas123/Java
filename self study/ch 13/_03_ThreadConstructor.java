
class MyThr extends Thread
{
    MyThr(String name)
    {
        super(name);        //calling the constructor of Thread which is Thread(String name)
    }
    @Override
    public void run()
    {
        System.out.println("I am a Thread");
    }
}
class MyThr2 implements Runnable
{
    public void run()
    {
        System.out.println("I am a Thread2");
    }
}
public class _03_ThreadConstructor {
    public static void main(String[] args) {
        // MyThr t1=new MyThr("Dipto");
        // System.out.println("The name of the thread is: "+t1.getName());
        // System.out.println("The ID of the thread is: "+t1.getId());
        // t1.start();

        MyThr2 t1=new MyThr2();

        Thread actual=new Thread(t1, "Dipto");
        System.out.println("The name of the thread is: "+actual.getName());
    }
}
