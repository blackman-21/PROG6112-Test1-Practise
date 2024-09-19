public class DemoSalesPerson {
    public static void main(String[] args) {
        SalesPerson[] salesPeople = new SalesPerson[10];

        // Initializing 10 Salesperson objects with ID 9999 and sales 0
        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i] = new SalesPerson(9999, 0.0);
        }

        // Display the 10 Salesperson objects
        for (SalesPerson salesperson : salesPeople) {
            System.out.println(salesperson);
        }
    }
}
