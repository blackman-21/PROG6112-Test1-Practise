import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class SalespersonDatabase {
    public static void main(String[] args) {
        ArrayList<SalesPerson> salesPeople = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        boolean continueLoop = true;

        while (continueLoop) {
            System.out.println("Choose an option: ");
            System.out.println("1. Add record");
            System.out.println("2. Delete record");
            System.out.println("3. Change record");
            System.out.println("4. Exit");

            int option = input.nextInt();

            switch (option) {
                case 1:
                    addRecord(salesPeople, input);
                    break;
                case 2:
                    deleteRecord(salesPeople, input);
                    break;
                case 3:
                    changeRecord(salesPeople, input);
                    break;
                case 4:
                    continueLoop = false;
                    break;
                default:
                    System.out.println("Invalid option.");
            }

            // Display updated database in ascending order by ID number
            salesPeople.sort(Comparator.comparingInt(SalesPerson::getIdNumber));
            displayDatabase(salesPeople);
        }
    }

    // Add a record
    public static void addRecord(ArrayList<SalesPerson> salesPeople, Scanner input) {
        if (salesPeople.size() >= 20) {
            System.out.println("Error: Database is full.");
            return;
        }

        System.out.print("Enter Salesperson ID: ");
        int id = input.nextInt();

        // Check if ID already exists
        for (SalesPerson sp : salesPeople) {
            if (sp.getIdNumber() == id) {
                System.out.println("Error: ID already exists.");
                return;
            }
        }

        System.out.print("Enter Salesperson Annual Sales: ");
        double sales = input.nextDouble();

        salesPeople.add(new SalesPerson(id, sales));
    }

    // Delete a record
    public static void deleteRecord(ArrayList<SalesPerson> salesPeople, Scanner input) {
        if (salesPeople.isEmpty()) {
            System.out.println("Error: Database is empty.");
            return;
        }

        System.out.print("Enter Salesperson ID to delete: ");
        int id = input.nextInt();

        // Find and remove the record
        SalesPerson toRemove = null;
        for (SalesPerson sp : salesPeople) {
            if (sp.getIdNumber() == id) {
                toRemove = sp;
                break;
            }
        }

        if (toRemove != null) {
            salesPeople.remove(toRemove);
            System.out.println("Record deleted.");
        } else {
            System.out.println("Error: ID not found.");
        }
    }

    // Change a record
    public static void changeRecord(ArrayList<SalesPerson> salesPeople, Scanner input) {
        if (salesPeople.isEmpty()) {
            System.out.println("Error: Database is empty.");
            return;
        }

        System.out.print("Enter Salesperson ID to change: ");
        int id = input.nextInt();

        // Find and change the record
        SalesPerson toChange = null;
        for (SalesPerson sp : salesPeople) {
            if (sp.getIdNumber() == id) {
                toChange = sp;
                break;
            }
        }

        if (toChange != null) {
            System.out.print("Enter new Annual Sales: ");
            double sales = input.nextDouble();
            toChange.setAnnualSales(sales);
            System.out.println("Record updated.");
        } else {
            System.out.println("Error: ID not found.");
        }
    }

    // Display the database
    public static void displayDatabase(ArrayList<SalesPerson> salesPeople) {
        System.out.println("Current database:");
        for (SalesPerson sp : salesPeople) {
            System.out.println(sp);
        }
    }
}
