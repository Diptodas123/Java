import java.util.Scanner;

class RBI
{
    Scanner sc= new Scanner(System.in);
    float principal, time;
    RBI()
    {
        principal=0;
        time=0;
    }
    
    void input()
    {
        // Scanner sc= new Scanner(System.in);
        System.out.print("Enter principal: ");
        this.principal=sc.nextFloat();
        System.out.print("Enter time period: ");
        this.time=sc.nextFloat();
    }
}

class PNB extends RBI
{ 
    float roi;
    PNB(RBI o)
    {
        roi=0;
        this.principal=o.principal;
        this.time=o.time;
    }
    float interest()
    {
        // Scanner sc= new Scanner(System.in);
        System.out.print("Enter the rate of interest for PNB: ");
        roi=sc.nextFloat();
        float i=(principal*time*roi)/100.0f;
        float finalAmount=principal+i;
        return finalAmount;
    } 
}

class SBI extends RBI
{
    float roi;
    SBI(RBI o)
    {
        roi=0;
        this.principal=o.principal;
        this.time=o.time;
    }
    float interest()
    {
        // Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rate of interest for SBI: ");
        roi=sc.nextFloat();
        float i=(principal*time*roi)/100.0f;
        float finalAmount=principal+i;
        return finalAmount;
    } 
}

class AXIS extends RBI
{
    float roi;
    AXIS(RBI o)
    {
        roi=0;
        this.principal=o.principal;
        this.time=o.time;
    }
    float interest()
    {
        // Scanner sc=new Scanner(System.in);
        System.out.print("Enter the rate of interest for AXIS: ");
        roi=sc.nextFloat();
        float i=(principal*time*roi)/100.0f;
        float finalAmount=principal+i;
        return finalAmount;
    }   
}

public class Bank {
    public static void main(String[] args) {

        RBI obj1=new RBI();

        obj1.input();

        PNB obj2=new PNB(obj1);
        SBI obj3=new SBI(obj1);
        AXIS obj4=new AXIS(obj1);

        for(int i=0;i<=60;i++)
        {
            System.out.print("-");
        }
        System.out.println();
        float finalAmount1=obj2.interest();
        float finalAmount2=obj3.interest();
        float finalAmount3=obj4.interest();

        for(int i=0;i<=60;i++)
        {
            System.out.print("-");
           
        }
        System.out.println();
        System.out.println("Final amount after maturity in PNB is= "+finalAmount1);
        System.out.println("Final amount after maturity in SBI is= "+finalAmount2);
        System.out.println("Final amount after maturity in AXIS is= "+finalAmount3);
       
    }
}
