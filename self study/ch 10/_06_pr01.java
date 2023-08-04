class Circle {
    float r;

    Circle(int r) {
        this.r = r;
    }

    public double area() {
        return Math.PI * this.r * this.r;
    }
}

class Cylinder extends Circle {
    float h;

    Cylinder(int r, int h) {
        super(r);       //calling the parameterized constructor of Circle class
        this.h = h;
    }

    @Override
    public double area() {
        return (2 * Math.PI * r * h) + (2 * Math.PI * r * r);
    }

    public double volume() {
        return 2 * Math.PI * r * r * h;
    }

}

public class _06_pr01 {
    public static void main(String[] args) {
        // Circle cir=new Circle(4);
        // System.out.println("Area of the circle is: " + cir.area());

        Cylinder cyl = new Cylinder(4, 6);
        System.out.println("Area of the circle is: " + cyl.area());
        System.out.println("Volume of the circle is: " + cyl.volume());
        

    }
}
