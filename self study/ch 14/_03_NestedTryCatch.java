import java.util.Scanner;

public class _03_NestedTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[3];
        marks[0] = 73;
        marks[1] = 58;
        marks[2] = 05;

        boolean flag = true;
        while (flag) {
            System.out.println("Enter the value of index: ");
            int index = sc.nextInt();
            try 
            {
                System.out.println("Welcome");
                try 
                {
                    System.out.println("Value at index is: " + marks[index]);
                    flag = false;       //if there's no exception then only this statement gets executed  
                } 
                catch (ArrayIndexOutOfBoundsException e) {
                    System.out.println("Sorry this index does not exist");
                }
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("Thanks for using this program");
    }
}