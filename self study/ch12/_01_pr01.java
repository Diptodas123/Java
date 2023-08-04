package calc;

class Calculator {
    public void sum(int a, int b) {
        System.out.println("The result is= " + (a + b));
    }
}

class ScCalculator {
    public void sum(int a, int b) {
        System.out.println("The result is= " + Math.sin(a + b));
    }
}

class HybridCalculator {
    public void sum(int a, int b) {
        System.out.println("The result is= " + (a + b));
        System.out.println("The result is= " + Math.sin(a + b));
    }
}

public class _01_pr01 {
    public static void main(String[] args) {
        System.out.println("main function");
    }
}
