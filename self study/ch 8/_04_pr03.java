
class Square
{
    int side;
    void setSide(int a)
    {
        side=a;
    }
    int area()
    {
        return side*side;       //area of square = a^2
    }
    int perimeter()
    {
        return 4*side;          //parameter of square = 4*a
    }
}
public class _04_pr03 {
    public static void main(String[] args) {
        Square sqr=new Square();
        sqr.setSide(7);
        System.out.println("Area: "+sqr.area());
        System.out.println("Perimeter: "+sqr.perimeter());
    }
}
