import java.util.Random;
import java.util.Scanner;

public class NumberGuessingApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int secretNumber = random.nextInt(100) + 1;
        int attempts = 0;
        boolean guessedCorrectly = false;

        System.out.println("LOADING...............................................");

        System.out.println("\t\t Hello, Kindly enter your name\n");
        String userName = input.nextLine();

        System.out.println("\t" + "\t" + "Dear " + userName + " Welcome to Semi-Colon Guessing Game!\n");
        System.out.println("\t" + "\t" + "You are required to guess a number between 1 and 100\n");
        System.out.println("\t" + "\t" + "You have 5 attempts.\n");

        while (attempts < 5 && !guessedCorrectly) {

        System.out.print("\t" + "Enter your guess number: " + "\n");
         
        if (!input.hasNextInt()) {
        System.out.println("\t" + "\t" + "Invalid input! Please enter a number." + "\n");
        input.nextInt(); 
        continue; 
        }
        int userGuess = input.nextInt();

        if (userGuess < 1 || userGuess > 100) {
        System.out.println("\t" + "\t" + "Number must be between 1 and 100!" + "\n");
        continue; 
        }

        attempts++; 
            
        if (userGuess == secretNumber) {
        guessedCorrectly = true;
        System.out.println("\t" + "\t" + "Congratulations " + userName + "! You guessed correctly in " + attempts + " attempts." + "\n");
        } else if (userGuess < secretNumber) {
        System.out.println("\t" + "\t" + "Too low! Try again." + "\n");
        } else {
        System.out.println("\t" + "\t" + "Too high! Try again." + "\n");
            }
        }
        
        if (!guessedCorrectly) {
        System.out.println("\t" + "\t" + "Sorry " + userName + ", you've used all attempts." + "\n");
        System.out.println("\t" + "\t" + "The correct number was: " + secretNumber + "\n");
        }

      
    }
}
