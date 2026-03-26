import java.util.Scanner;

public class PhoneContact {

    static String[] firstNames = new String[100];
    static String[] lastNames = new String[100];
    static String[] phoneNumbers = new String[100];
    static int count = 0;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n=== CONTACT MANAGER ===");
            System.out.println("1. Add Contact");
            System.out.println("2. Remove Contact");
            System.out.println("3. Find Contact");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = input.nextInt(); 

            switch (choice) {
                case 1:
                    addContact(input);
                    break;
                case 2:
                    removeContact(input);
                    break;
                case 3:
                    findContact(input);
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

 
    }

    
    public static void addContact(Scanner input) {
    input.nextLine(); 

    System.out.print("Enter First Name: ");
    String first = input.nextLine();

    System.out.print("Enter Last Name: ");
    String last = input.nextLine();

    System.out.print("Enter Phone: ");
    String phone = input.nextLine();

    firstNames[count] = first;
    lastNames[count] = last;
    phoneNumbers[count] = phone;
    count++;

    System.out.println("Contact Added Successfully!");
}

  }  

