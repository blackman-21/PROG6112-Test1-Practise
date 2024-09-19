import java.util.Scanner;

public class DistanceFromAverage {
    public static void main(String[] args) {
        double[] numbers = new double[15];
        Scanner input = new Scanner(System.in);
        int count = 0;
        double sum = 0;

        // Accept user input
        while (count < 15) {
            System.out.print("Enter a number (99999 to quit): ");
            double num = input.nextDouble();
            if (num == 99999) {
                if (count == 0) {
                    System.out.println("Error: No numbers were entered.");
                    return;
                }
                break;
            }
            numbers[count] = num;
            sum += num;
            count++;
        }

        // Calculate average
        double average = sum / count;

        // Display results
        System.out.println("You entered " + count + " numbers.");
        System.out.println("The average is: " + average);
        for (int i = 0; i < count; i++) {
            System.out.printf("Number: %.2f, Distance from average: %.2f%n", numbers[i], Math.abs(numbers[i] - average));
        }
    }
}
