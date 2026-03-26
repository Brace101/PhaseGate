import java.util.Scanner;
public class PhoneContact {

    static String[] firstNames = new String[1000];
    static String[] lastNames = new String[1000];
    static String[] phoneNumbers = new String[1000];
    static int count = 0;

    static String indent = "\t\t";
    static String indentOne = "\t";

    static String GREEN = "\u001B[32m";
    static String RED = "\u001B[31m";
    static String YELLOW = "\u001B[33m";                    
    static String RESET = "\u001B[0m";                     
    static String PURPLE = "\u001B[35m";                       
    static String CYAN = "\u001B[36m";
    static String WHITE = "\u001B[37m";
    static String BOLD = "\u001B[1m";
    static String ITALIC = "\u001B[3m";

    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int choice = 0;

        do {
            System.out.println("\n" + indent + CYAN + BOLD + "=== PHONE CONTACT === 📲️" + RESET);
            System.out.println(GREEN + indentOne + "1. Add Contact" + RESET);
            System.out.println(GREEN + indentOne + "2. Remove Contact" + RESET);
            System.out.println(GREEN + indentOne + "3. Find Contact" + RESET);
            System.out.println(GREEN + indentOne + "4. Exit" + RESET);

            System.out.print(CYAN + indent + "Enter choice: " + RESET);

            if (!input.hasNextInt()) {
                System.out.println(RED + indent + "Invalid input!" + RESET);
                input.next();
                continue;
            }

            choice = input.nextInt();

            switch (choice) {
                case 1:
                    addContact(input);
                    break;
                case 2:
                    System.out.println(input);
                    break;
                case 3:
                    System.out.println(input);
                    break;
                case 4:
                    System.out.println("\n" + GREEN + indentOne + "Goodbye!" + RESET);
                    break;
                default:
                    System.out.println(indentOne + RED + "Invalid choice!" + RESET);
            }

        } while (choice != 4);
    }

    public static void addContact(Scanner input) {
        input.nextLine();

        if (count >= 100) {
            System.out.println(RED + indentOne + "Contact list is full!" + RESET);
            return;
        }

        System.out.print("\n" + indentOne + GREEN + "Enter First Name: " + RESET);
        String first = input.nextLine();

        System.out.print("\n" + indentOne + GREEN + "Enter Last Name: " + RESET);
        String last = input.nextLine();

        System.out.print("\n" + indentOne + GREEN + "Enter Phone: " + RESET);
        String phone = input.nextLine();

        firstNames[count] = first;
        lastNames[count] = last;
        phoneNumbers[count] = phone;
        count++;

        System.out.println("\n" + GREEN + indentOne + "Contact Added Successfully!" + RESET);
    }
}
