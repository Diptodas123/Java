abstract class Pen {
    abstract void write();

    abstract void refill();
}

class MainClass extends Pen {
    void write() {
        System.out.println("Writing...");
    }

    void refill() {
        System.out.println("refilling...");
    }
}

public class _06_pr01 {
    public static void main(String[] args) {
        MainClass mc = new MainClass();
        mc.write();
        mc.refill();
    }
}
