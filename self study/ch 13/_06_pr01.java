class GoodMorning extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Good Morning!!");
        }

    }
}
class Welcome extends Thread {
    @Override
    public void run() {
        while (true) {
            System.out.println("Welcome!!");
            try {
                Thread.sleep(200);
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}

public class _06_pr01 {
    public static void main(String[] args) {
        GoodMorning thread1 = new GoodMorning();
        Welcome thread2=new Welcome();
        thread1.start();
        thread2.start();
    }
}
