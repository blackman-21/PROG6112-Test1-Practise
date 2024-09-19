import java.util.Scanner;

public class CarCareChoice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a service (oil change, tire rotation, battery check, brake inspection): ");
        String service = input.nextLine();

        switch (service.toLowerCase()) {
            case "oil change":
                System.out.println("Oil Change - $25");
                break;
            case "tire rotation":
                System.out.println("Tire Rotation - $22");
                break;
            case "battery check":
                System.out.println("Battery Check - $15");
                break;
            case "brake inspection":
                System.out.println("Brake Inspection - $5");
                break;
            default:
                System.out.println("Error: Invalid service entered.");
        }
    }
}
