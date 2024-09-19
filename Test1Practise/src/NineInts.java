import java.util.Arrays;

public class NineInts {
    public static void main(String[] args) {
        int[] numbers = {5, 8, 12, 20, 3, 7, 15, 1, 9};

        // Display numbers from first to last
        System.out.println("Numbers from first to last: " + Arrays.toString(numbers));

        // Display numbers from last to first
        System.out.print("Numbers from last to first: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
    }
}
