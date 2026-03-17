import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to print its multiplication table: ");
        int numberTable = input.nextInt();

        System.out.println("Multiplication Table of " + numberTable + ":");

        for (int number = 1; number <= 12; number++) {
            System.out.println(numberTable + " x " + number + " = " + (numberTable * number));
        }
    }
}
