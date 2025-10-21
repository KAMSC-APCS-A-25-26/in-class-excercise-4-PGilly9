import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args) {
        // TODO: Prompt the user with a welcome message
        System.out.println("Welcome to the guessing game!");
        System.out.println("I am thinking of a number between 1 and 100. ");
        // TODO: Generate a random secret number between 1 and 100 (inclusive)
        int num, guess;
        Random rand = new Random();
        Scanner scan = new Scanner(System.in);
        num = rand.nextInt(100 + 1);
        // TODO: Use a do...while loop to read guesses until correct
        do{
            System.out.print("Enter your guess: ");
            guess = scan.nextInt();
            if (guess < num){
                System.out.println("Too Low. Try again.");
            }
            if (guess > num){
                System.out.println("Too high. Try again");
            }
        }
        while(guess != num);
        System.out.println("You got it!`");
        // TODO: Print "Too low" / "Too high" / "You got it!" accordingly
        // TODO: Use Scanner for input
    }
}
