import java.util.ArrayList;
import java.util.List;

// Abstract class Vehicle
abstract class Vehicle {
    // Abstract methods
    abstract void start();
    abstract void stop();
}

// Subclass Car extending Vehicle
class Car extends Vehicle {
    @Override
    void start() {
        System.out.println("Car started.");
    }

    @Override
    void stop() {
        System.out.println("Car stopped.");
    }
}

// Subclass Motorcycle extending Vehicle
class Motorcycle extends Vehicle {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }

    @Override
    void stop() {
        System.out.println("Motorcycle stopped.");
    }
}

// Driver class with a list of Vehicle objects
class Driver {
    private List<Vehicle> vehicles;

    // Constructor
    public Driver() {
        vehicles = new ArrayList<>();
    }

    // Method to add a Vehicle to the list
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Method to start all vehicles
    public void startAllVehicles() {
        System.out.println("Starting all vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.start();
        }
    }

    // Method to stop all vehicles
    public void stopAllVehicles() {
        System.out.println("Stopping all vehicles:");
        for (Vehicle vehicle : vehicles) {
            vehicle.stop();
        }
    }
}

// Main class to test the behavior of the classes
public class VehicleTest {
    public static void main(String[] args) {
        // Create objects of all classes
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();

        // Create a Driver
        Driver driver = new Driver();

        // Add vehicles to the Driver's list
        driver.addVehicle(car);
        driver.addVehicle(motorcycle);

        // Start and stop all vehicles
        driver.startAllVehicles();
        System.out.println("-----------------------------");
        driver.stopAllVehicles();
    }
}
