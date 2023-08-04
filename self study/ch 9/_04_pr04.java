class Rectangle
{
    int lenght;
    int breadth;
    Rectangle()
    {
        lenght=0;
        breadth=0;
    }
    Rectangle(int l,int b)
    {
        lenght=l;
        breadth=b;
    }
}
class _04_pr04 {
    public static void main(String[] args) {
        Rectangle rec=new Rectangle();
        System.out.println(rec.lenght);
        System.out.println(rec.breadth);

        //Creating another object using parameterized constructor(constructor overloaded)
        Rectangle rec2=new Rectangle(4,5);
        System.out.println(rec2.lenght);
        System.out.println(rec2.breadth);
    }
}
