public class SalesPerson {
    private int idNumber;
    private double annualSales;

    // Constructor
    public SalesPerson(int idNumber, double annualSales) {
        this.idNumber = idNumber;
        this.annualSales = annualSales;
    }

    // Getters and Setters
    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public double getAnnualSales() {
        return annualSales;
    }

    public void setAnnualSales(double annualSales) {
        this.annualSales = annualSales;
    }

    // toString method to display Salesperson details
    @Override
    public String toString() {
        return "Salesperson ID: " + idNumber + ", Annual Sales: $" + annualSales;
    }
}
