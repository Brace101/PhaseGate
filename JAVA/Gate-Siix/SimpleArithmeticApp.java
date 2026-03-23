//PSUEDOCODE

//import scanner so i can collect the name from the user, collect the user answers to eachquestions and also welcome the user to the app 
//import random numbers from java.util package to always suggest numbers for users
//initialize my for loop to display the arithmetic to the user sequentially
//set my for loop condtion to allow user take questions upto 10 as i'd initialize question to be 10 as global variable
//initialize my first number and second number with the random generation
//initialize the correct answer to be first number subtracted from secondnumber
//initialisze another for loop (Nested Loop) procisely to allow user attempt a questise at least twice 
//set my IF statement to control the correct answer
//set another If statement (Nested If statement) to also read the number of attempt
//also set my score as global variable so i can count numbers of questions the user got correctly  

import java.util.Random;
import java.util.Scanner;

public class SimpleArithmeticApp {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int totalQuestions = 10;
        int score = 0;
        boolean isCorrect = false;
    
        System.out.println("Hi, KIndly enter your name");
        String userName = input.nextLine();

        System.out.println("Hello Dear " + userName + " You're welcome to Simple Arithmetic Game App" + "\n");
        System.out.println("Dear " + userName + " Kindly note, you have 10 questions to answer below, you are entitle to just 2 attempt per question" + "\n");
        System.out.println("Wish you GoodLuck as you play the game " + userName + "!!!" + "\n");

        for (int index = 1; index <= totalQuestions; index++) {
        
        int firstNumber = random.nextInt(50); 
        int secondNumber = random.nextInt(50);
        int correctAnswer = firstNumber - secondNumber;
                      
        System.out.println("Question " + index + ": " + firstNumber + " - " + secondNumber);

        for (int attempt = 1; attempt <= 2; attempt++) {

        System.out.print("Attempt " + attempt + ": ");
        int userAnswer = input.nextInt();

        if (userAnswer == correctAnswer) {
        System.out.println("Correct!");
        score++;
        isCorrect = true;
        break;

        } else {
        if (attempt == 1) {
        System.out.println("You've inputed a wrong answer, kindly try again");
        if (attempt == 2) {
        System.out.println("Still a wrong answer, The correct answer is " + correctAnswer);
        }
        }
        }
        }
        
        }
        System.out.println("Your score: " + score + " out of " + totalQuestions + "\n");
        System.out.println("GAME-OVER!!!");

}
    }
