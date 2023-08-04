
import java.util.Scanner;

class _03_pr03 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the num of students: ");
        int numofStudents=sc.nextInt();

        int marks[]= new int[numofStudents];
        for(int i=0; i<marks.length; i++)
        {
            System.out.println("Enter the marks of "+(i+1)+" student");
            marks[i]=sc.nextInt();
        }
        int sum=0;
        for(int elements: marks)
        {
            sum=sum+elements;
        }
        int avg=sum/marks.length;
        System.out.println("Average marks of "+numofStudents+" students in Physics is= "+avg);
        sc.close();
    }
}
