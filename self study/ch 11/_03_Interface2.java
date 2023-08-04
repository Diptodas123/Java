
interface Cycle {
    int a = 5;

    void applyBrake(int decrement);

    void speedUp(int increment);

}

interface Horn {
    void blowHorn();

    void blowBell();
}

// a single class can implement more than one interface at the same time

class AvonCycle implements Cycle, Horn {
    public int speed = 7;

    @Override
    public void applyBrake(int decrement) {
        this.speed = this.speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }

    public void blowHorn() {
        System.out.println("Honk......");
    }

    public void blowBell() {
        System.out.println("Ring.....");
    }
}

public class _03_Interface2 {
    public static void main(String[] args) {
        AvonCycle c = new AvonCycle();
        c.speedUp(7);
        c.applyBrake(1);
        System.out.println("Speed= " + c.speed);
        System.out.println("a= " + c.a);
        c.blowHorn();
        c.blowBell();
    }
}
//we can declare a reference var of interface and refer to a object of a implementing concrete class (using dynamic method dispatch & perfrom runtime polymorphism)
