import java.util.Scanner;

public class ArrayMethodDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];

        // Prompt user to input 10 integers
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Call methods
        displayAll(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan12(numbers);
        displayAboveAverage(numbers);
    }

    // (1) Display all integers
    public static void displayAll(int[] numbers) {
        System.out.println("All integers: ");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    // (2) Display all integers in reverse
    public static void displayReverse(int[] numbers) {
        System.out.println("Integers in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

    // (3) Display sum of integers
    public static void displaySum(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of integers: " + sum);
    }

    // (4) Display values less than 12
    public static void displayLessThan12(int[] numbers) {
        boolean found = false;
        System.out.println("Values less than 12:");
        for (int num : numbers) {
            if (num < 12) {
                System.out.print(num + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.println("None");
        } else {
            System.out.println();
        }
    }

    // (5) Display values above the average
    public static void displayAboveAverage(int[] numbers) {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = sum / (double) numbers.length;
        System.out.println("Values greater than the average (" + average + "):");
        for (int num : numbers) {
            if (num > average) {
                System.out.print(num + " ");
            }
        }
        System.out.println();
    }
}
