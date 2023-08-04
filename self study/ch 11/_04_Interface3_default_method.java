interface Camera {
    void takeSnap();

    void recordVideo();

    default void recordIn4K() /*(implementing is not mandetory in every class)it doesn't forces the
                              implementing classes to define*/
    {
        System.out.println("recording in 4k");
    }
}

interface Wifi {
    String[] getNetwork();

    void connectToNetworks(String Networks);
}

interface Mp3Player {
    void playMusic();

    void stopMusic();
}

class CellPhone {
    void callNumber(int phoneNumber) {
        System.out.println("Calling " + phoneNumber);
    }

    void pickNumber() {
        System.out.println("Connecting....");
    }
}

class SmartPhone extends CellPhone implements Camera, Wifi, Mp3Player {
    public void takeSnap() {
        System.out.println("taking snap...");
    }

    public void recordVideo() {
        System.out.println("recording video...");
    }

    public void connectToNetworks(String Network) {
        System.out.println("Connecting to " + Network);
    }

    public String[] getNetwork() {
        System.out.println("getting list of networks");
        String[] networkList = { "Lantasy", "TpLink", "DpLink" };
        return networkList;
    }

    public void playMusic() {
        System.out.println("playing music...");
    }

    public void stopMusic() {
        System.out.println("stopping music...");
    }
}

public class _04_Interface3_default_method {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        for (String item : sm.getNetwork()) {
            System.out.println(item);
        }
        sm.recordIn4K();

        Camera c=new SmartPhone();      //dynamic method dispatch(runtime polymorphism)
        c.takeSnap();
        c.recordIn4K();
    }
}
