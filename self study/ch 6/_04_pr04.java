import java.util.Scanner;

class _04_pr04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the row & column of 1st matrix: ");
        int r1 = sc.nextInt();
        int c1 = sc.nextInt();
        int m1[][] = new int[r1][c1];

        System.out.println("Enter the row & column of 2nd matrix: ");
        int r2 = sc.nextInt();
        int c2 = sc.nextInt();
        int m2[][] = new int[r2][c2];

        if(r1!=r2 || c1!=r2)
        {
            System.out.println("Addition cannot be done!!!");
            System.exit(0);
        }

        int r[][] = new int[r1][c1];
        System.out.println("Enter the elements of 1st matrix: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                m1[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("Enter the elements of 2nd matrix: ");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                m2[i][j] = sc.nextInt();
            }
            System.out.println("");
        }
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                // r[i][j] = 0;
                r[i][j] = m1[i][j] + m2[i][j];

            }
        }
        System.out.println("The final matrix is: ");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                System.out.print(r[i][j] + " ");
            }
            System.out.println("");
        }
        sc.close();
    }
}
