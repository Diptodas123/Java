import java.util.Scanner;

class Time 
{
    Scanner sc=new Scanner(System.in);
    int hour,minute,second;             //instance vars'       

    Time()              //constructor to initialize
    {
        hour=0;
        minute=0;
        second=0;
    }
    void input()        //method to take i/p(accessible by obejct)
    {
        System.out.print("Enter hour: ");
        hour=sc.nextInt();

        System.out.print("Enter minute: ");
        minute=sc.nextInt();

        System.out.print("Enter second: ");
        second=sc.nextInt();
    }
    void conversion(int h,int m,int s)          //method to convert
    {   
        int result=0;
        System.out.print("Press 1-> to convert hours to minutes\n");
        System.out.print("Press 2-> to convert minutes to seconds\n");
        System.out.print("Press 3-> to convert both hours to minutes to seconds\n");
        System.out.print("Press 4-> to exit\n");
        System.out.print("Enter your choice: ");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1:
                result=(h*60)+m;
                System.out.println("::After conversion::\n");
                System.out.println(hour+" hours= "+result+" minutes");
                break;
            case 2:
                result=(m*60)+s;
                System.out.println("::After conversion::\n");
                System.out.println(minute+" minutes= "+result+" seconds");
                break;
            case 3:
                result=(h*60*60)+(m*60)+s;
                System.out.println("::After conversion::\n");
                System.out.println(hour+" hours+"+minute+" minutes= "+result+" seconds");
                break;
            case 4:
                System.exit(0);
            default:
                System.out.println("Invalid choice!!");
        }
    }

    void display()                 //method to show o/p
    {
        System.out.println("Hour:Minute:Second= "+hour+":"+minute+":"+second);
    }
}
class Demo
{
    public static void main(String[] args) 
    {
        Time ob1=new Time();
        Time ob2=new Time();
        ob1.input();
        ob1.display();
        ob1.conversion(ob1.hour, ob1.minute, ob1.second);

        ob2.input();
        ob2.display();
        ob2.conversion(ob2.hour, ob2.minute, ob2.second);
    } 
}