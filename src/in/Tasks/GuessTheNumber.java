package in.Tasks;
import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rm = new Random();
        
        int lowLimit = 1;
        int upLimit = 100;
        int maxAttempts = 10;
        int roundsWon = 0;
        int totalAttempts = 0;
        boolean playAgain = true;
        
        System.out.println("Welcome to Guess the Number game!");
        
        while (playAgain) {
            int numberToGuess = rm.nextInt(upLimit - lowLimit + 1) + lowLimit;
            int attempts = 0;
            
            System.out.println("I'm thinking of a number between " + lowLimit + " and " + upLimit + ".");
            
            while (attempts < maxAttempts) {
                System.out.print("Enter your guess: ");
                int userGuess = sc.nextInt();
                attempts++;
                
                if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try again.");
                } else if (userGuess > numberToGuess) {
                    System.out.println("Too high! Try again.");
                } else {
                    System.out.println("Congratulations! You guessed the number " + numberToGuess + " in " + attempts + " attempts.");
                    totalAttempts += attempts;
                    roundsWon++;
                    break;
                }
            }
            
            if (attempts == maxAttempts) {
                System.out.println("Sorry, you've reached the maximum number of attempts. The number was " + numberToGuess + ".");
            }
            
            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainInput = sc.next().toLowerCase();
            if (!playAgainInput.equals("yes")) {
                playAgain = false;
            }
        }
        
        sc.close();
        
        System.out.println("Game over! You won " + roundsWon + " round(s) with an average of " + (totalAttempts / (double) roundsWon) + " attempts per round.");
    }
}
