import java.util.Scanner;

public class _06_pr04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day in number: ");

        int day = sc.nextInt();
        /*
         * if one condition evaluates true then after the execution of the statement the
         * other statemets will aslo be executed after that particluar statement.
         * to get rid of this fault we use break statement to come out of that switch
         * case block of condition
         */
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong choice!!");
        }

        sc.close();
        /*
         * //can also be written as::
         * switch (day)
         * {
         * case 1 -> System.out.println("Monday");
         * case 2 -> System.out.println("Tuesday");
         * case 3 -> System.out.println("Wednesday");
         * case 4 -> System.out.println("Thursday");
         * case 5 -> System.out.println("Friday");
         * case 6 -> System.out.println("Saturday");
         * case 7 -> System.out.println("Sunday");
         * default -> System.out.println("Wrong choice!!");
         * }
         */

    }
}
