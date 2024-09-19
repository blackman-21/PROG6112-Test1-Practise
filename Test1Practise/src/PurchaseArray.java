import java.util.Scanner;

public class PurchaseArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Purchase[] purchases = new Purchase[5];

        for (int i = 0; i < purchases.length; i++) {
            purchases[i] = new Purchase();

            // Prompt for invoice number (must be between 1000 and 8000)
            int invoiceNumber;
            do {
                System.out.print("Enter invoice number (1000-8000) for purchase #" + (i + 1) + ": ");
                invoiceNumber = input.nextInt();
            } while (invoiceNumber < 1000 || invoiceNumber > 8000);
            purchases[i].setInvoiceNumber(invoiceNumber);

            // Prompt for sale amount (must be non-negative)
            double saleAmount;
            do {
                System.out.print("Enter sale amount for purchase #" + (i + 1) + ": ");
                saleAmount = input.nextDouble();
            } while (saleAmount < 0);
            purchases[i].setSaleAmount(saleAmount);
        }

        // Display all purchase details
        for (Purchase purchase : purchases) {
            purchase.display();
            System.out.println();
        }
    }
}
