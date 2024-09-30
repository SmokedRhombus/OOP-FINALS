//Group 5 Members:
//Roa, Miguel Dominic E.
//Gonzales, Ian Manuel P.
//Timbol, Alyssa Louise L.
//Apostol, Lance Jezreel B.

public class Employee {
    private String name;
    private int employeeId;
    private double baseSalary;

    public Employee(String name, int employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }
}