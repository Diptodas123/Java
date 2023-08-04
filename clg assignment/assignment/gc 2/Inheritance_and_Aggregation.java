class A {
    int a, b;

    A() {
        a = 0;
        b = 0;
    }

    A(int a, int b) {
        this.a = a;
        this.b = b;
    }

    int sum() {
        int s = a + b;
        return s;
    }

}
class B extends A {
    int c;

    B() {
        c = 0;
    }

    B(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    void display() {
        int result=sum()*c;
        System.out.println("Result= " + result);
    }
}

public class Inheritance_and_Aggregation {
    public static void main(String[] args) {
        B b = new B(10, 15, 20);
        b.display();
    }
}
