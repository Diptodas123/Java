interface TVRemote {
    void swtichOn();

    void swtichOff();
}

interface SmartTVRemote extends TVRemote {
    void netflix();

    void youtube();
}

 class TV implements TVRemote {
    public void swtichOn() {
        System.out.println("switching on the tv...");
    }

    public void swtichOff() {
        System.out.println("switching off the tv...");
    }
}

public class _11_pr06 {
    public static void main(String[] args) {
        TV tele = new TV();
        tele.swtichOn();
        tele.swtichOff();
    }
}
