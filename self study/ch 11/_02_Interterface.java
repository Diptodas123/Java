//in inheritance we use extends keyword whereas in case of interface we use implements keyword
//in interface every methods should be defined by every implementing class(if and only if the class implements the interface)

interface Cycle {
    int a = 5; // every properties of interfaces are by deafault (final) in nature(so can't be modified)

    void applyBrake(int decrement);

    void speedUp(int increment);

    /*
     * can also be written as abstract method->
     * 
     * abstract void applyBrake(int decrement);
     * abstract void speedUp(int increment);
     * 
     */
}

class AvonCycle implements Cycle {
    public int speed = 7;

    @Override
    public void applyBrake(int decrement) {
        this.speed = this.speed - decrement;
    }

    @Override
    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }
}

public class _02_Interterface {
    public static void main(String[] args) {
        AvonCycle c = new AvonCycle();
        c.speedUp(7);
        c.applyBrake(1);
        System.out.println("Speed= " + c.speed);
        System.out.println("a= " + c.a);

    }
}
