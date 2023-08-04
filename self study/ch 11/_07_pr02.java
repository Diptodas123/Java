abstract class Pen {
    abstract void write();

    abstract void refill();
}

class FountainPen extends Pen {
    void write() {
        System.out.println("Writing...");
    }

    void refill() {
        System.out.println("refilling...");
    }

    void changeNib()
    {
        System.out.println("changing nib...");
    }
}

public class _07_pr02 {
    public static void main(String[] args) {
        FountainPen fp=new FountainPen();
        fp.write();
        fp.refill();
        fp.changeNib();

        //Using dynamic dispatch(runtime polymorphism) -->
        Pen p=new FountainPen();
        p.write();
        p.refill();
    }
}
