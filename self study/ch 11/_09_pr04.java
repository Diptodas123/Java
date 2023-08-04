abstract class TelePhone {
    abstract void ring();

    abstract void lift();

    abstract void disconnect();
}

class SmartPhone extends TelePhone {
    void ring() {
        System.out.println("Ringing...");
    }

    void lift() {
        System.out.println("Lifting...");
    }

    void disconnect() {
        System.out.println("disconnecting...");
    }
}

public class _09_pr04 {
    public static void main(String[] args) {
        TelePhone tp = new SmartPhone();
        tp.ring();
        tp.lift();
        tp.disconnect();
    }
}
