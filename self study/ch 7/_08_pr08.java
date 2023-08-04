
public class _08_pr08 {
    static void pattern(int row)
    {
        if(row>0)
        {
            pattern(row-1);
            for (int i = 1; i <= row; i++) 
            {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
       pattern(7);
    }
}
