
class CellPhone
{
    public void printRing()
    {
        System.out.println("Ringing....");
    }
    public void printVibrate()
    {
        System.out.println("Vibrating....");
    }
    public void printCall()
    {
        System.out.println("Calling....");
    }
}
public class _03_pr02 {
    public static void main(String[] args) {
        CellPhone obj=new CellPhone();
        obj.printVibrate();
        obj.printRing();
        obj.printCall();
    }
}
