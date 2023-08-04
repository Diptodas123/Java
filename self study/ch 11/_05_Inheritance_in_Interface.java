interface ParentInterface {
    void meth1();

    void meth2();
}

interface ChildInterface extends ParentInterface {
    void meth3();

    void meth4();
}

class SampleClass implements ChildInterface {
    public void meth1() {
        System.out.println("meth1");
    }

    public void meth2() {
        System.out.println("meth2");
    }

    public void meth3() {
        System.out.println("meth3");
    }

    public void meth4() {
        System.out.println("meth4");
    }
}

public class _05_Inheritance_in_Interface {
    public static void main(String[] args) {
        SampleClass obj = new SampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
