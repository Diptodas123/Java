import java.util.Scanner;

class array {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int [][] flats=new int[2][3];
        System.out.println("Enter the elements of 2-D array: ");
        
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                flats[i][j]=sc.nextInt();
            }
            System.out.println("");
        }
        System.out.println("the 2-D array is: ");
        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

        
        sc.close();
    }
}
