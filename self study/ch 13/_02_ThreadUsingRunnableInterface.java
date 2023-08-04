class MyRunnable1 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("Thread 1");
        }
    }
    void abc()
    {
        System.out.println("abc");
    }
}

class MyRunnable2 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i < 40000) {
            System.out.println("Thread 2");
        }
    }
}

public class _02_ThreadUsingRunnableInterface {
    public static void main(String[] args) {
        MyRunnable1 t1=new MyRunnable1();   //first we need to instantiate a object of implementing class then we need to instantiate a object of Thread class
        MyRunnable2 t2=new MyRunnable2();

        //without creating obj of Thread we can't invoke the start method in case of implementing Runnable interface
        Thread actual1=new Thread(t1);      //here t1 is runnable target
        Thread actual2=new Thread(t2);
    
        actual1.start();
        actual2.start();
        
    }
}
