import java.util.Arrays;
import java.util.Scanner;

public class StringSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] strings = new String[15];
        int count = 0;

        // Accept up to 15 strings from the user
        for (int i = 0; i < strings.length; i++) {
            System.out.print("Enter a string (or 'quit' to stop): ");
            String userInput = input.nextLine();
            if (userInput.equalsIgnoreCase("quit")) {
                break;
            }
            strings[count] = userInput;
            count++;
        }

        // Sort the array in ascending order
        Arrays.sort(strings, 0, count);

        // Display the sorted array
        System.out.println("Sorted Strings:");
        for (int i = 0; i < count; i++) {
            System.out.println(strings[i]);
        }
    }
}
