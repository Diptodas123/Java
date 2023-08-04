
public class Static_keyword {
    static int a=10,b;
    static void display(int x)
    {
        System.out.println("a= "+a);
        System.out.println("b= "+b);
        System.out.println("x= "+x);
    }    
    static
    {
        b=a*4;
    }
    public static void main(String[] args) {
        display(30);
    }
}
