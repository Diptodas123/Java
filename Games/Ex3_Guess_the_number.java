
import java.util.Random;
import java.util.Scanner;

class Game {
    int numOfGuesses;
    int compNum;
    int userNum;

    Game() {
        Random rdn = new Random();
        this.compNum = rdn.nextInt(101);
        this.numOfGuesses = 0;
    }

    public void takeUserInput() {
        Scanner sc = new Scanner(System.in);
        this.numOfGuesses++;
        System.out.println("Guess a number(0-100): ");
        this.userNum = sc.nextInt();
    }

    public boolean isCorrectNum() {
        if (this.userNum >= 0 && this.userNum <= 100) {
            if (this.userNum == this.compNum) {
                return true;
            } else if (this.userNum > this.compNum) {
                System.out.println("The number is smaller than your guessed number!!");
            } else {
                System.out.println("The number is greater than your guessed number!!");
            }
        } else {
            System.out.println("Enter value in between 0 to 100");
        }
        return false;

    }

}

public class Ex3_Guess_the_number {
    public static void main(String[] args) {

        Game gm = new Game();
        System.out.println("::Welcome to Guess the number game::");
        for (int i = 0; i < 60; i++) {
            System.out.print("_");
        }
        System.out.println();
        while (true) {
            gm.takeUserInput();
            if (gm.isCorrectNum()) {
                System.out.println("Congratulations, You got the number!!\nYou took " + gm.numOfGuesses
                        + " attempts to guess the number");
                System.exit(0);
            } else {
                System.out.println("try again....");
            }

        }

    }
}
