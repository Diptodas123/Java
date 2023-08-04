import java.util.Scanner;

class MyException2 extends Exception {
    @Override
    public String toString() // this is what gets printed in case we print the exception e
    {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class _05_Throws {
    static int divide(int a, int b) throws MyException2 {
        if (b < 0) {
            throw new MyException2();
        }
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        try {
            int r = divide(10, 0);
            System.out.println(r);
        } catch (Exception e) {
            MyException2 t = new MyException2();
            System.out.println(t.toString());
            System.out.println(t.getMessage());
            System.out.println("Exception");
        } finally // The finally block executes whether exception rise or not and whether
                  // exception handled or not
        {
            System.out.println("I execute always");
        }

    }
}
