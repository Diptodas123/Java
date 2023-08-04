
class MyThr extends Thread {

    MyThr(String name)
    {
        super(name);
    }
    @Override
    public void run() {
        while (true) {
            System.out.println(this.getName());
        }
    }
}

public class _04_ThreadPriority {
    public static void main(String[] args) {
        MyThr t1 = new MyThr("Dipto");
        MyThr t2 = new MyThr("Harry");
        MyThr t3 = new MyThr("Carry");
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        t3.start();

        //priority queue of threads to keep track the priority 
        //this priority totally depends on the OS
    }
}
