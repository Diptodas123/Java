class MyThread1 extends Thread
{
    @Override
    public void run()
    {
        for(int i=0;i<10;i++)
        {
            System.out.println(i);
        }
    }
}
class MyThread2 extends Thread
{
    @Override
    public void run()
    {
        int i=0;
        while (i<10) {
            System.out.println("Thread 2");
            i++;
        }
    }
}
public class _01_ThreadUsingThreadClass {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        
        t1.start();     //in case of, a subclass extends a Thread class then we just need to invoke start method(member method of Thread) and every functions of that subclass would be called automatically
        try {
            t1.join();      //means join after t1's run is exitted
        } catch (Exception e) {
            
        }
        t2.start();

        //Multithreading in java are managed in concurrent way(doing more than one job and managing them one by one at the same time(not parallelly)) by the processor 
    }
}
