class Cylinder
{
    float radius;
    float height;
    float pi;
    Cylinder()
    {
        radius=0;
        height=0;
        pi=3.14f;
    }
    
    void setRadius(float r)
    {
        radius=r;
    }
    void setHeight(float h)
    {
        height=h;
    }
    float getRadius()
    {
        return radius;
    }
    float getHeight()
    {
        return height;
    }
    float getSurfaceArea()
    {
        return (2*pi*radius*height)+(2*pi*radius*radius);
    }
    float getVolume()
    {
        return pi*radius*radius*height;
    }
}
class _03_pr01 {
    public static void main(String[] args) {
        Cylinder cyl=new Cylinder();
        cyl.setRadius(7.5f);
        cyl.setHeight(6.3f);
        System.out.println("Radius: "+cyl.getRadius());
        System.out.println("Height: "+cyl.getHeight());
        System.out.println("Surface Area: "+cyl.getSurfaceArea());
        System.out.println("Volume: "+cyl.getVolume());
    }
}
