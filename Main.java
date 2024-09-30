//Group 5 Members:
//Roa, Miguel Dominic E.
//Gonzales, Ian Manuel P.
//Timbol, Alyssa Louise L.
//Apostol, Lance Jezreel B.

public class Main {
    public static void main(String[] args) {
        PayrollSystem payrollSystem = new PayrollSystem();

        Employee emp1 = new Employee("Miguel Roa", 1, 50000);
        Employee emp2 = new Employee("Ian Gonzales", 2, 60000);
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);

        System.out.println("\nAll Employees:");
        payrollSystem.displayAllEmployees();

        Employee retrievedEmp = payrollSystem.getEmployee(1);
        if (retrievedEmp != null) {
            System.out.println("\nRetrieved Employee: " + retrievedEmp.getName());
        }

        payrollSystem.updateEmployeeSalary(2, 65000);
        System.out.println("\nAll Employees After Update:");
        payrollSystem.displayAllEmployees();

        payrollSystem.removeEmployee(1);
        System.out.println("\nAll Employees After Deletion:");
        payrollSystem.displayAllEmployees();
    }
}