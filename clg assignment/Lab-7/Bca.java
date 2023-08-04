interface Tha
{
    void show();
}
public class Bca implements Tha{
    public void show()
    {
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Bca obj=new Bca();
        obj.show();
    }
}
