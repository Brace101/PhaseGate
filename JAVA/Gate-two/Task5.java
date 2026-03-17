import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number");
        int numberFac = input.nextInt();

        int factorial = 1;

        for (int number = 1; number <= numberFac; number++) {
            factorial = factorial * number;
        }

        System.out.println("Factorial = " + factorial);
    }
}
