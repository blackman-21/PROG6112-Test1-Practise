public class DemoSalesPerson2 {
    public static void main(String[] args) {
        SalesPerson[] salesPeople = new SalesPerson[10];

        // Assign ID numbers from 111 to 120 and sales from 25000 to 70000 incremented by 5000
        int id = 111;
        double sales = 25000.0;
        for (int i = 0; i < salesPeople.length; i++) {
            salesPeople[i] = new SalesPerson(id++, sales);
            sales += 5000;
        }

        // Display the 10 Salesperson objects
        for (SalesPerson salesperson : salesPeople) {
            System.out.println(salesperson);
        }
    }
}
