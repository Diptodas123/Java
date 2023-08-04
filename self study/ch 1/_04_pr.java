import java.util.Scanner;

public class _04_pr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter distance in Kilo-meters: ");
        double km = sc.nextDouble();
        double mile = km / 1.61;

        System.out.printf("%.1f km= %.2f miles", km, mile);

        sc.close();
    }
}
