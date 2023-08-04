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

public class _08_pr03 {
    public static void main(String[] args) {
        Human hum = new Human();
        hum.eat();
        hum.jump();
    }
}
