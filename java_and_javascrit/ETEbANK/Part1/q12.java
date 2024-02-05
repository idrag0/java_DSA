class Employee {
    public double calculateSalary() {
        // Base implementation for calculating salary
        return 0.0;
    }
}

class Manager extends Employee {
    @Override
    public double calculateSalary() {
        // Implementation for calculating salary for Manager
        return /* calculation */;
    }
}

class Programmer extends Employee {
    @Override
    public double calculateSalary() {
        // Implementation for calculating salary for Programmer
        return /* calculation */;
    }
}

public class q12 {
    public static void main(String[] args) {
        Employee employee1 = new Manager();
        Employee employee2 = new Programmer();

        double salary1 = employee1.calculateSalary();
        double salary2 = employee2.calculateSalary();

        System.out.println("Salary of Manager: " + salary1);
        System.out.println("Salary of Programmer: " + salary2);
    }
}