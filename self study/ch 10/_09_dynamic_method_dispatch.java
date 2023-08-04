class Phone
{
    public void on()
    {
        System.out.println("Turning on the phone....");
    }
}
class SmartPhone extends Phone
{
    @Override
    public void on()         
    {
        System.out.println("Turning on the Smartphone....");
    }
    public void alarm()
    {
        System.out.println("Alarm ringing....");
    }
}
public class _09_dynamic_method_dispatch {
    public static void main(String[] args) {
        Phone phn=new SmartPhone();     //runtime-polymorphism as its done in runtime bcause the object is created in runtime
        phn.on();

        //phn.alarm();  ->not allowed as the referenece var is of Phone type which can't access the methods of Smartphone
    }
}
