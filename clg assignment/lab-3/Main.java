import java.util.Scanner;

class Measurement {
   
    float feet,inch;

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value in feet: ");
        feet=sc.nextFloat();

        System.out.print("Enter value in inch: ");
        inch=sc.nextFloat();
        sc.close();
    }
    void display()
    {
        System.out.println("Value of feet: "+feet);
        System.out.println("Value of inch: "+inch);
    }
    void terminate()
    {
        System.out.println("The program is terminating");
    }
}
class Main
{
    public static void main(String[] args) {
        Measurement m1=new Measurement();
        Measurement m2=new Measurement();

        m1.input();
        m1.display();
        m1.terminate();

        m2.input();
        m2.display();
        m2.terminate();
    }
}
