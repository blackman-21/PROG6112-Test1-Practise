public class DrugTests3 {
    public static void main(String[] args) {
        int[] employeeTestCounts = new int[30];
        int lastEmployee = -1;

        for (int week = 1; week <= 52; week++) {
            int employee;
            do {
                employee = 1 + (int) (Math.random() * 30);
                if (employee == lastEmployee) {
                    System.out.println("Duplicate employee #" + employee + " selected. Picking another.");
                }
            } while (employee == lastEmployee);

            // Update last employee
            lastEmployee = employee;

            // Increment the count for this employee
            employeeTestCounts[employee - 1]++;

            // Display the selected employee number
            System.out.print("Week " + week + ": Employee #" + employee);

            if (week % 4 == 0) {
                System.out.println();
            } else {
                System.out.print("\t");
            }
        }

        System.out.println("\n\nEmployee Test Counts:");
        for (int i = 0; i < employeeTestCounts.length; i++) {
            System.out.println("Employee #" + (i + 1) + ": Tested " + employeeTestCounts[i] + " time(s)");
        }

        // Display employees who were never tested
        System.out.println("\nEmployees never selected:");
        for (int i = 0; i < employeeTestCounts.length; i++) {
            if (employeeTestCounts[i] == 0) {
                System.out.println("Employee #" + (i + 1));
            }
        }
    }
}
