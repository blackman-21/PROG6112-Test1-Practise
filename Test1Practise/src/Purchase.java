public class Purchase {
    private int invoiceNumber;
    private double saleAmount;
    private double salesTax;

    // Setters
    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public void setSaleAmount(double saleAmount) {
        if (saleAmount >= 0) {
            this.saleAmount = saleAmount;
            this.salesTax = saleAmount * 0.05;
        } else {
            System.out.println("Sale amount must be non-negative.");
        }
    }

    // Display method
    public void display() {
        System.out.println("Invoice Number: " + invoiceNumber);
        System.out.println("Sale Amount: $" + saleAmount);
        System.out.println("Sales Tax: $" + salesTax);
    }
}
