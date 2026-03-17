import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        for (int index = 1; index <= 5; index++) {
            System.out.println("Enter number " + index + ":");
            int number = input.nextInt();

            sum = sum + number;
        }

        System.out.println("Sum = " + sum);

       
    }
}
