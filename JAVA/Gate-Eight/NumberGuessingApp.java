import java.util.Random;
import java.util.Scanner;

public class NumberGuessingApp {
    public static void main(String[] args) {                                                  
                                                                                    
        Scanner input = new Scanner(System.in);                                         
        Random random = new Random();                                               
                                                                                    
        String playAgain = "YES";                                                    
                                                                                    
        while (playAgain.equalsIgnoreCase("YES")) {                                 
                                                                                    
        int secretNumber = random.nextInt(100)+1;                                   
        int attempts = 0;
        boolean guessedCorrectly = false;
        String indent = "\t\t";
        String indentOne = "\t";
        String userResponse = "";

        String GREEN = "\u001B[32m";
        String RED = "\u001B[31m";
        String YELLOW = "\u001B[33m";                    
        String RESET = "\u001B[0m";                     
        String PURPLE = "\u001B[35m";                       
        String CYAN = "\u001B[36m";
        String WHITE = "\u001B[37m";
        String BOLD = "\u001B[1m";
        String ITALIC = "\u001B[3m";

        System.out.println(GREEN  + "||                  //\\          ||           || ||\\       ||   //=========  ||         ||" + "\n" + RESET);
        System.out.println(GREEN  + "||                 //  \\         ||           || || \\      ||  //            ||         ||" + "\n" + RESET);
        System.out.println(GREEN  + "||                //    \\        ||           || ||  \\     || ||             ||         ||" + "\n" + RESET);
        System.out.println(GREEN  + "||               //      \\       ||           || ||   \\    || ||             ||         ||" + "\n" + RESET);
        System.out.println(GREEN  + "||              //        \\      ||           || ||    \\   || ||             ||=========||" + "\n" + RESET);
        System.out.println(GREEN  + "||             // ======== \\     ||           || ||     \\  || ||             ||         ||" + "\n" + RESET);
        System.out.println(GREEN  + "||            //            \\    ||           || ||      \\ || ||             ||         ||" + "\n" + RESET);
        System.out.println(GREEN  + "||           //              \\   \\           // ||       \\|| \\             ||         ||" + "\n" + RESET);
        System.out.println(GREEN  + "=========== //                \\   \\=========//  ||         ||  \\==========  ||         ||" + "\n" + RESET);

        System.out.println(CYAN + BOLD + ITALIC + indentOne + "SESSION LOADING..............................................." + RESET);

        System.out.println(WHITE + BOLD + ITALIC + indent + "Hello, Kindly enter your name" + "\n" + RESET);
        String userName = input.nextLine();

        System.out.println(GREEN + BOLD + indentOne + "=======================================" + RESET);
        System.out.println(PURPLE + BOLD + indent + ITALIC + "🎮️GUESSING GAME🎮️" + RESET);
        System.out.println(GREEN + BOLD + indentOne +  "=======================================" + RESET);
        System.out.println(CYAN + indent + ITALIC + "Welcome, " + userName + "!!!" + RESET);
        System.out.println(GREEN + BOLD + indentOne + "---------------------------------------" + "\n" + RESET);

        System.out.println(YELLOW + indent + "Guess a number between 1 and 100" + RESET);
        System.out.println(YELLOW + indent + "You have 5 attempts.\n" + RESET);

        while (!userResponse.equalsIgnoreCase("OK")) {
        System.out.print(WHITE + indent + "Type 'OK' to start: " + RESET);
        userResponse = input.nextLine();

        if (!userResponse.equalsIgnoreCase("OK")) {
         System.out.println(RED + indentOne + "Invalid input. Please type 'OK'." + "\n" + RESET);
        }
        }

        System.out.println(GREEN + indent + "Game Starting...\n" + "\n" + RESET);

        while (attempts < 5 && !guessedCorrectly) {

        System.out.println(CYAN + indent + "Attempt " + (attempts + 1) + " of 5" + RESET);
        System.out.print(WHITE + indent + "Enter your guess > " + RESET);

        if (!input.hasNextInt()) {
        System.out.println(RED + indent + "Invalid input! Please enter a number.\n" + RESET);
        input.next();
        continue;
        }

        int userGuess = input.nextInt();
        input.nextLine();

        if (userGuess < 1 || userGuess > 100) {
        System.out.println(YELLOW + indent + "Number must be between 1 and 100!\n" + RESET);
        continue;
        }

        attempts++;

        if (userGuess == secretNumber) {
        guessedCorrectly = true;
        System.out.println(GREEN + BOLD + indent + " CORRECT! " + RESET);
        System.out.println(GREEN + indent + "You guessed it in " + attempts + " attempts.\n" + RESET);
        } else if (userGuess < secretNumber) {
        System.out.println(YELLOW + indent + " Too low!\n" + RESET);
        } else {
        System.out.println(YELLOW + indent + " Too high!\n" + RESET);
        }
        }
       
        if (!guessedCorrectly) {
        System.out.println(RED + BOLD + indent + " GAME OVER " + RESET);
        System.out.println(RED + indent + "The correct number was: " + secretNumber + "\n" + RESET);
        }
    
        System.out.print(WHITE + indent + "Do you want to play again? (YES/NO): " + RESET);
        playAgain = input.nextLine();

        while (!playAgain.equalsIgnoreCase("YES") && !playAgain.equalsIgnoreCase("NO")) {
        System.out.print(RED + indent + "Invalid input! Please type YES or NO: " + "\n" + RESET);
        playAgain = input.nextLine();
        }
        System.out.println("\n" + GREEN + "Thanks for playing! Goodbye!" + "\n" + RESET);

        }

}   
}
