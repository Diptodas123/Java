interface BasicAnimal {
    void eat();

    void sleep();
}

class Monkey {
    void jump() {
        System.out.println("jumping...");
    }

    void bite() {
        System.out.println("bitting..");
    }
}

class Human extends Monkey implements BasicAnimal {
    public void eat() {
        System.out.println("eating...");
    }

    public void sleep() {
        System.out.println("sleeping...");
    }
}

public class _10_pr05 {
    public static void main(String[] args) {
        Monkey m = new Human();
        m.jump();
        m.bite();
    }
}
