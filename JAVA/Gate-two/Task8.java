import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers, enter 0 to stop:");

        int number = input.nextInt();

        while (number != 0) {
            sum = sum + number;
            number = input.nextInt(); 
        }

        System.out.println("Total = " + sum);

       
    }
}
