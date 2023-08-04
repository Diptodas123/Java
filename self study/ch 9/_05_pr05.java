class Sphere
{
    float radius;
    float pi;
    Sphere()
    {
        radius=0;
        pi=3.14f;
    }
    
    void setRadius(float r)
    {
        radius=r;
    }
    float getRadius()
    {
        return radius;
    }  
    float getSurfaceArea()
    {
        return 4*pi*radius*radius;
    }
    float getVolume()
    {
        return 4/3.0f*(pi*radius*radius*radius);
    }
}
class _05_pr05 {
    public static void main(String[] args) {
        Sphere spr=new Sphere();
        spr.setRadius(7.5f);
        System.out.println("Radius: "+spr.getRadius());
        System.out.println("Radius: "+spr.getSurfaceArea());
        System.out.println("Radius: "+spr.getVolume());
    }
}
