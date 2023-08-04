
public class _04_pr04 {
    static void pattern(int n) 
    {
        for (int i = n; i >= 1; i--) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) 
    {
        pattern(7);
    }
}
