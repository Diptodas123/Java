class Circle
{
    float radius;
    static float pi=3.14f;
    void setRadius(float r)
    {
        radius=r;
    }
    float getArea()
    {   
        return pi*radius*radius;
    }
    float getCircumference()
    {
        return 2*pi*radius;
    }
}
class _07_pr06 {
    public static void main(String[] args) {
        Circle cr=new Circle();
        cr.setRadius(7.5f);
        System.out.println("Area of the circle= "+cr.getArea());
        System.out.println("Circumference of the circle= "+cr.getCircumference());
        
    }
}
