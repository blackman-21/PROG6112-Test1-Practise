import javax.swing.*;
import java.util.Arrays;
import java.util.Comparator;

public class RentalDemo {
    public static void main(String[] args) {
        Rental[] rentals = new Rental[8];
        String[] options = {"Sort by Contract Number", "Sort by Price", "Sort by Equipment Type"};

        // Input rental data
        for (int i = 0; i < rentals.length; i++) {
            String contractNumber = JOptionPane.showInputDialog("Enter Contract Number:");
            int rentalHours = Integer.parseInt(JOptionPane.showInputDialog("Enter Number of Rental Hours:"));
            int equipmentType = Integer.parseInt(JOptionPane.showInputDialog("Enter Equipment Type (0=Personal Watercraft, 1=Pontoon Boat, 2=Rowboat, 3=Canoe, 4=Kayak, 5=Beach Chair, 6=Umbrella, 7=Other):"));
            rentals[i] = new Rental(contractNumber, rentalHours, equipmentType);
        }

        // Continue sorting and displaying until user chooses to quit
        boolean continueSorting = true;
        while (continueSorting) {
            String choice = (String) JOptionPane.showInputDialog(null, "Choose sorting option:", "Sort Rentals", JOptionPane.QUESTION_MESSAGE, null, options, options[0]);

            switch (choice) {
                case "Sort by Contract Number":
                    Arrays.sort(rentals, Comparator.comparing(Rental::getContractNumber));
                    break;
                case "Sort by Price":
                    Arrays.sort(rentals, Comparator.comparingDouble(Rental::getPrice));
                    break;
                case "Sort by Equipment Type":
                    Arrays.sort(rentals, Comparator.comparingInt(Rental::getEquipmentType));
                    break;
                default:
                    continueSorting = false;
                    break;
            }

            // Display sorted rentals
            StringBuilder output = new StringBuilder();
            for (Rental rental : rentals) {
                output.append(rental.toString()).append("\n-------------------\n");
            }
            JOptionPane.showMessageDialog(null, output.toString(), "Sorted Rentals", JOptionPane.INFORMATION_MESSAGE);

            // Ask if the user wants to continue sorting
            int response = JOptionPane.showConfirmDialog(null, "Do you want to continue sorting?", "Continue", JOptionPane.YES_NO_OPTION);
            if (response == JOptionPane.NO_OPTION) {
                continueSorting = false;
            }
        }
    }
}
