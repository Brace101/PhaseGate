import java.util.Scanner;
public class Task17{
    public static void main (String [] args){
    Scanner input = new Scanner(System.in);

    String passCode = "admin123";

    System.out.println("Enter your password");
    String passWord = input.nextLine();
    
    if (passWord == passCode){
    System.out.println("Your password matches with your passcode");
    }
    else{
    System.out.println("It doesnt matches");
    }

}
    }

