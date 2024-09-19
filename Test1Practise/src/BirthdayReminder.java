import java.util.Scanner;

public class BirthdayReminder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] friendNames = new String[10];
        String[] birthDates = new String[10];
        int count = 0;

        // Prompt the user to enter names and birthdates
        while (count < 10) {
            System.out.print("Enter friend's name (or ZZZ to quit): ");
            String name = input.nextLine();

            if (name.equalsIgnoreCase("ZZZ")) {
                break;
            }

            friendNames[count] = name;

            System.out.print("Enter " + name + "'s birthdate (MM/DD/YYYY): ");
            birthDates[count] = input.nextLine();

            count++;
        }

        // Display how many names were entered
        System.out.println("You entered " + count + " friends.");

        // Display the names
        for (int i = 0; i < count; i++) {
            System.out.println("Friend #" + (i + 1) + ": " + friendNames[i]);
        }

        // Loop to allow user to check birthdays
        String searchName;
        do {
            System.out.print("Enter a friend's name to get the birthdate (or ZZZ to quit): ");
            searchName = input.nextLine();

            if (searchName.equalsIgnoreCase("ZZZ")) {
                break;
            }

            boolean found = false;
            for (int i = 0; i < count; i++) {
                if (friendNames[i].equalsIgnoreCase(searchName)) {
                    System.out.println(searchName + "'s birthdate is: " + birthDates[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                System.out.println("Error: Name not found.");
            }
        } while (!searchName.equalsIgnoreCase("ZZZ"));
    }
}
