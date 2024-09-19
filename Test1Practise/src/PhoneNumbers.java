import java.util.Scanner;

public class PhoneNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create arrays for 30 people (names and phone numbers)
        String[] names = new String[30];
        String[] phoneNumbers = new String[30];

        // Assign names and phone numbers for the first 10 people
        names[0] = "Alice"; phoneNumbers[0] = "555-1234";
        names[1] = "Bob"; phoneNumbers[1] = "555-5678";
        names[2] = "Carol"; phoneNumbers[2] = "555-9101";
        names[3] = "Dave"; phoneNumbers[3] = "555-1213";
        names[4] = "Eve"; phoneNumbers[4] = "555-1415";
        names[5] = "Frank"; phoneNumbers[5] = "555-1617";
        names[6] = "Grace"; phoneNumbers[6] = "555-1819";
        names[7] = "Heidi"; phoneNumbers[7] = "555-2021";
        names[8] = "Ivan"; phoneNumbers[8] = "555-2223";
        names[9] = "Judy"; phoneNumbers[9] = "555-2425";

        int count = 10;
        String name;

        // Continue to prompt the user for names until "quit" is entered
        do {
            System.out.print("Enter a name (or 'quit' to exit): ");
            name = input.nextLine();

            if (name.equalsIgnoreCase("quit")) {
                break;
            }

            // Search for the name in the existing list
            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (names[i].equalsIgnoreCase(name)) {
                    System.out.println("Phone number for " + name + ": " + phoneNumbers[i]);
                    found = true;
                    break;
                }
            }

            // If the name is not found, prompt for a phone number and add it
            if (!found) {
                if (count < 30) {
                    System.out.print("Name not found. Enter phone number for " + name + ": ");
                    phoneNumbers[count] = input.nextLine();
                    names[count] = name;
                    count++;
                } else {
                    System.out.println("Directory is full. No more entries can be added.");
                }
            }
        } while (!name.equalsIgnoreCase("quit"));
    }
}
