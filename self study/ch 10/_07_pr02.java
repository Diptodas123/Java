class Rectangle {
    int lenght, width;

    Rectangle(int lenght, int width) {
        this.lenght = lenght;
        this.width = width;
    }

    public int area() {
        return lenght * width;
    }
}

class Cuboid extends Rectangle {
    int height;

    Cuboid(int lenght, int width, int height) {
        super(lenght, width);
        this.height = height;
    }

    @Override
    public int area() {
        return 2 * (lenght * width + width * height + height * lenght);
    }
}

public class _07_pr02 {
    public static void main(String[] args) {
        Cuboid cub = new Cuboid(4, 5, 6);
        System.out.println("Area of the cuboid is: " + cub.area());
    }

}
