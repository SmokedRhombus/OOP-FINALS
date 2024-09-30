//Group 5 Members:
//Roa, Miguel Dominic E.
//Gonzales, Ian Manuel P.
//Timbol, Alyssa Louise L.
//Apostol, Lance Jezreel B.

import java.util.ArrayList;
import java.util.List;

public class PayrollSystem {
    private List<Employee> employees;

    public PayrollSystem() {
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
        System.out.println("Employee added: " + employee.getName());
    }

    public Employee getEmployee(int employeeId) {
        for (Employee employee : employees) {
            if (employee.getEmployeeId() == employeeId) {
                return employee;
            }
        }
        return null;
    }

    public void displayAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees in the system.");
        } else {
            for (Employee employee : employees) {
                System.out.println("ID: " + employee.getEmployeeId() + ", Name: " + employee.getName() + ", Salary: PHP " + employee.getBaseSalary());
            }
        }
    }

    public void updateEmployeeSalary(int employeeId, double newSalary) {
        Employee employee = getEmployee(employeeId);
        if (employee != null) {
            employee.setBaseSalary(newSalary);
            System.out.println("Salary updated for employee: " + employee.getName());
        } else {
            System.out.println("Employee not found.");
        }
    }

    public void removeEmployee(int employeeId) {
        Employee employeeToRemove = getEmployee(employeeId);
        if (employeeToRemove != null) {
            employees.remove(employeeToRemove);
            System.out.println("Employee removed: " + employeeToRemove.getName());
        } else {
            System.out.println("Employee not found.");
        }
    }
}