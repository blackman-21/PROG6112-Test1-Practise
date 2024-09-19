import java.util.Arrays;
import java.util.Scanner;
import java.util.Comparator;

public class SalespersonSort {
    public static void main(String[] args) {
        SalesPerson[] salesPeople = new SalesPerson[7];
        Scanner input = new Scanner(System.in);

        // User input for Salesperson array
        for (int i = 0; i < salesPeople.length; i++) {
            System.out.print("Enter Salesperson ID: ");
            int id = input.nextInt();
            System.out.print("Enter Salesperson Annual Sales: ");
            double sales = input.nextDouble();
            salesPeople[i] = new SalesPerson(id, sales);
        }

        // Prompt user to choose sort by ID or sales
        System.out.println("Do you want to sort by (1) ID number or (2) Sales value?");
        int choice = input.nextInt();

        if (choice == 1) {
            // Sort by ID
            Arrays.sort(salesPeople, Comparator.comparingInt(SalesPerson::getIdNumber));
        } else if (choice == 2) {
            // Sort by sales
            Arrays.sort(salesPeople, Comparator.comparingDouble(SalesPerson::getAnnualSales));
        } else {
            System.out.println("Invalid choice!");
            return;
        }

        // Display sorted Salesperson array
        for (SalesPerson salesperson : salesPeople) {
            System.out.println(salesperson);
        }
    }
}
