public class _06_Finally {
    public static int method() {
        try {
            int a = 5;
            int b = 2;
            int c = a / b;
            return c;
        } catch (Exception e) {
            System.out.println(e);
        } finally {         //this finally block will always execute even if there's a return statement in try block
            System.out.println("End of method execution");
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(method());
    }
}
