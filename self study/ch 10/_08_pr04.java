import java.sql.Array;
import java.util.LinkedList;

class Rectangle {
    int lenght, width;

    public void setLenght(int lenght) {
        this.lenght = lenght;
    }

    public int getLenght() {
        return lenght;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public int area() {
        return this.lenght * this.width;
    }
}

class Cuboid extends Rectangle {
    int height;
    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public int area() {
        return 2 * (super.lenght * super.width + super.width * this.height + this.height * super.lenght);
    }
}

public class _08_pr04 {
    public static void main(String[] args) {
        Cuboid cub = new Cuboid();
        cub.setLenght(4);
        cub.setWidth(5);
        cub.setHeight(6);
        
        System.out.println("Lenght= "+cub.getLenght());
        System.out.println("Width= "+cub.getWidth());
        System.out.println("Height= "+cub.getHeight());

        System.out.println("Area of the cuboid is: " + cub.area());
    }

}
