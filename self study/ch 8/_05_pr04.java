import java.util.Scanner;

class Rectangle
{
    float lenght;
    float width;
    float getArea()
    {
        return lenght*width;
    }
    float getPerimeter()
    {
        return 2*(lenght+width);
    }
}

public class _05_pr04 {
    public static void main(String[] args) {
        Rectangle rec= new Rectangle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter width: ");
        rec.width=sc.nextFloat();
        System.out.println("Enter lenght: ");
        rec.lenght=sc.nextFloat();
        System.out.println("Area: "+rec.getArea());
        System.out.println("Perimeter: "+rec.getPerimeter());
        sc.close();
    }
}
