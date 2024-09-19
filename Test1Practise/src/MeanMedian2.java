import java.util.Arrays;
import java.util.Scanner;

public class MeanMedian2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[20];
        int count = 0;

        // Accept up to 20 integers from the user
        System.out.println("Enter integers (up to 20). Enter '99999' to stop:");
        while (count < 20) {
            System.out.print("Enter number #" + (count + 1) + ": ");
            int num = input.nextInt();
            if (num == 99999) {
                break;
            }
            numbers[count] = num;
            count++;
        }

        // Display the values
        System.out.println("The values you entered are:");
        for (int i = 0; i < count; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

        // Calculate the mean
        double sum = 0;
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }
        double mean = sum / count;
        System.out.println("Mean: " + mean);

        // Sort the array and calculate the median
        Arrays.sort(numbers, 0, count);
        double median;
        if (count % 2 == 1) {
            median = numbers[count / 2];  // Odd number of elements, middle value
        } else {
            median = (numbers[(count / 2) - 1] + numbers[count / 2]) / 2.0;  // Even number, average of two middle values
        }
        System.out.println("Median: " + median);
    }
}
