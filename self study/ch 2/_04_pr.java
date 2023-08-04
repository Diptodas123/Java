
public class _04_pr {
    public static void main(String[] args) {

        //encrypting the grade 
        char grade='B';
        grade=(char)(grade+8);  //typecasting the value to char as operation between char and int would give int
        System.out.println("After encryption: "+grade);

        //decrypting the grade
        grade=(char)(grade-8);  //typecasting the value to char as operation between char and int would give int
        System.out.println("After decryption: "+grade);

    }
}
