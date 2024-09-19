import java.util.Scanner;

public class CarCareChoice2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first three characters of a service (oil change, tire rotation, battery check, brake inspection): ");
        String service = input.nextLine().toLowerCase();

        switch (service) {
            case "oil":
                System.out.println("Oil Change - $25");
                break;
            case "tir":
                System.out.println("Tire Rotation - $22");
                break;
            case "bat":
                System.out.println("Battery Check - $15");
                break;
            case "bra":
                System.out.println("Brake Inspection - $5");
                break;
            default:
                System.out.println("Error: Invalid service entered.");
        }
    }
}
