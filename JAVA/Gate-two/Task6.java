import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;

        for (int index = 1; index <= number; index++) {
            sum = sum + index;
        }

        System.out.println("Sum from 1 to " + number + " is: " + sum);
    }
}
