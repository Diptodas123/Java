
public class _01_pr01 {
    public static void main(String[] args) {
        
        float arr[]={10.3f, 15.5f, 20.75f, 25.00f, 30.9f};

        float sum=0;
        for (float elements : arr) {
            sum=sum+elements;
        }
        System.out.printf("Sum= %.2f",sum);
    }    
}
