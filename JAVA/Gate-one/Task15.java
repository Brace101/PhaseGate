import java.util.Scanner;
public class Task15{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);
    
    System.out.println("Enter first number");
    int firstNumber = input.nextInt();

    System.out.println("Enter second number");
    int secondNumber = input.nextInt();

    System.out.println("Enter third number");
    int thirdNumber = input.nextInt();

    if (firstNumber > secondNumber && firstNumber > thirdNumber){
    System.out.println("largest number is " + (firstNumber));
    }
    if (secondNumber > firstNumber && secondNumber > thirdNumber){
    System.out.println("largest number is " + (secondNumber));
    }
    if (thirdNumber > firstNumber && thirdNumber > secondNumber){
    System.out.println("largest number is " + (thirdNumber));
    }
    

}
    }

