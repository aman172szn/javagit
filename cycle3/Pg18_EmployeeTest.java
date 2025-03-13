abstract class Employee {
    protected String name;
    protected int id;

    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public void displayDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public PartTimeEmployee(String name, int id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}

public class Pg18_EmployeeTest {
    public static void main(String[] args) {
        FullTimeEmployee ftEmployee = new FullTimeEmployee("Alice", 101, 5000);
        PartTimeEmployee ptEmployee = new PartTimeEmployee("Bob", 102, 20, 80);

        System.out.println("Full-Time Employee Details:");
        ftEmployee.displayDetails();
        System.out.println("Monthly Salary: " + ftEmployee.calculateSalary());

        System.out.println("\nPart-Time Employee Details:");
        ptEmployee.displayDetails();
        System.out.println("Total Salary: " + ptEmployee.calculateSalary());
    }
}
