// Abstract class Employee
abstract class Employee {
    protected String name;
    protected double salary;

    // Constructor
    public Employee(String name) {
        this.name = name;
    }

    // Abstract methods
    abstract void calculateSalary();
    abstract void displayEmployeeDetails();
}

// Subclass Manager extending Employee
class Manager extends Employee {
    private double bonus;

    // Constructor
    public Manager(String name, double bonus) {
        super(name);
        this.bonus = bonus;
    }

    // Implementation of abstract methods
    @Override
    void calculateSalary() {
        // Manager's salary includes a bonus
        salary = 50000 + bonus;
    }

    @Override
    void displayEmployeeDetails() {
        System.out.println("Manager Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass Worker extending Employee
class Worker extends Employee {
    private int hoursWorked;

    // Constructor
    public Worker(String name, int hoursWorked) {
        super(name);
        this.hoursWorked = hoursWorked;
    }

    // Implementation of abstract methods
    @Override
    void calculateSalary() {
        // Worker's salary is based on hours worked
        salary = hoursWorked * 15; // Assuming $15 per hour
    }

    @Override
    void displayEmployeeDetails() {
        System.out.println("Worker Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Subclass SalesPerson extending Manager
class SalesPerson extends Manager {
    private double commission;

    // Constructor
    public SalesPerson(String name, double bonus, double commission) {
        super(name, bonus);
        this.commission = commission;
    }

    // Override necessary methods
    @Override
    void calculateSalary() {
        // SalesPerson's salary includes both bonus and commission
        super.calculateSalary(); // Call the calculateSalary() method from the parent class (Manager)
        salary += commission;
    }

    @Override
    void displayEmployeeDetails() {
        System.out.println("SalesPerson Details:");
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
    }
}

// Main class to test the behavior of the classes
public class EmployeeTest {
    public static void main(String[] args) {
        // Create objects of all classes
        Manager manager = new Manager("John Manager", 5000);
        Worker worker = new Worker("Alice Worker", 40);
        SalesPerson salesPerson = new SalesPerson("Bob SalesPerson", 5000, 2000);

        // Calculate and display employee details
        manager.calculateSalary();
        manager.displayEmployeeDetails();

        worker.calculateSalary();
        worker.displayEmployeeDetails();

        salesPerson.calculateSalary();
        salesPerson.displayEmployeeDetails();
    }
}

