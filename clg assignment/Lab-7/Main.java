interface THA 
{
    void bbaShow();
    void bcaShow();
}
class BBA implements THA
{
    public void bbaShow()
    {
        System.out.println("bbaShow of BBA class");
    }
    public void bcaShow()
    {
        System.out.println("bcaShow of BBA class");
    }
}
class BCA implements THA
{
    public void bbaShow()
    {
        System.out.println("bbaShow of BCA class");
    }
    public void bcaShow()
    {
        System.out.println("bcaShow of BCA class");
    }
}
public class Main {
    public static void main(String[] args) {
        BBA obj1=new BBA();
        BCA obj2=new BCA();
        obj1.bbaShow();
        obj1.bcaShow();
        obj2.bbaShow();
        obj2.bcaShow();
        
    }
}
