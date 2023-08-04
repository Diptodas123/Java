class MyThr3 extends Thread
{
    @Override  
    public void run()
    {
        int i=0;
        while (i<500) {
            System.out.println("My Thread 3");

            /*to use sleep() method
            *     try {
            *         Thread.sleep(415);
            *     } catch (InterruptedException e) {
            *         System.out.println(e);
            *     }
            */
            i++;
        }
    }
}
class MyThr4 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while (i<500) {
            System.out.println("My Thread 4");
            i++;
        }
    }
}
public class _05_ThreadMethods {
    public static void main(String[] args) {
        MyThr3 t1=new MyThr3();
        MyThr4 t2=new MyThr4();
        t1.start();
        try {               //t1.join() using that in try-catch block in case, the thread gets blocked then the method can throw some error
            t1.join();      //join() method is used to say the processor not to start the execution of t2 until the execution of t1 thread is completed
        } catch (Exception e) {
           System.out.println(e);
        }
        t2.start();         //t2 thread would not get executed until the process of t1 thread is completed(since, we've used join() method)  
    }
}
