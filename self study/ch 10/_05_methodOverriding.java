class A {

    public void method1() {
        System.out.println("This is method 1 of class A");
    }

    public void method2() {
        System.out.println("This is method 2 of class A");
    }
}

class B extends A {
    @Override
    public void method2() // overridden method
    {
        System.out.println("This is method 2 of class B");
    }

    public void method3() {
        System.out.println("This is method 3 of class B");
    }
}

public class _05_methodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.method2();

        B b = new B();
        b.method2();
    }
}
