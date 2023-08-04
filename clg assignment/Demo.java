
class Box
{
    double height;
    double width;
    double depth;
    Box(double h, double w, double d)
    {
        height=h;
        width=w;
        depth=d;
    }
    Box(Box o)
    {
        height=o.height;
        width=o.width;
        depth=o.depth;
    }
    double volume()
    {
        return height*width*depth;
    }
}
class Demo 
{
    public static void main(String[] args) 
    {
        Box ob1=new Box(10,15,20);
        Box ob2=new Box(ob1);

        System.out.println("Width= "+ob2.width);
        System.out.println("height= "+ob2.height);
        System.out.println("depth= "+ob2.depth);
        System.out.println("volume= "+ob2.volume());
    }
}
