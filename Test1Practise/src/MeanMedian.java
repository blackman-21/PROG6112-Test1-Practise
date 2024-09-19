import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[9];

        // Accept 9 integers from the user
        System.out.println("Enter 9 integers:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number #" + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Display the values
        System.out.println("The values you entered are:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Calculate the mean
        double sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double mean = sum / numbers.length;
        System.out.println("Mean: " + mean);

        // Sort the array and calculate the median
        Arrays.sort(numbers);
        int median = numbers[numbers.length / 2];  // Since it's an odd number, the median is the middle value
        System.out.println("Median: " + median);
    }
}
