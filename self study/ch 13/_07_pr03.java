class Thread1 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 1");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Thread 2");
        }
    }
}

public class _07_pr03 {
    public static void main(String[] args) {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(1);
        System.out.println("Priority of t1 is: " + t1.getPriority());
        System.out.println("Priority of t2 is: " + t2.getPriority());
        //t1.start();
        // t2.start();
        System.out.println(t1.getState());      //-> to print the state of a thread
        System.out.println(Thread.currentThread().getState()); //->to print the state of the current state that's being executed 
    }
}
