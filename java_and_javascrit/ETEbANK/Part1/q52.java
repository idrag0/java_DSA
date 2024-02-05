import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

// Interface Department
interface Department {
    void printAttributes();
}

// Class Hostel
class Hostel {
    protected String hostelName;
    protected String hostelLocation;
    protected int numberOfRooms;

    // Constructor
    public Hostel(String hostelName, String hostelLocation, int numberOfRooms) {
        this.hostelName = hostelName;
        this.hostelLocation = hostelLocation;
        this.numberOfRooms = numberOfRooms;
    }

    // Method to print attributes
    public void printAttributes() {
        System.out.println("Hostel Name: " + hostelName);
        System.out.println("Hostel Location: " + hostelLocation);
        System.out.println("Number of Rooms: " + numberOfRooms);
    }
}

// Class Student implementing Department interface
class Student extends Hostel implements Department {
    private String studentName;
    private String regdNo;
    private String electiveSubject;
    private double avgMarks;

    // Constructor
    public Student(String hostelName, String hostelLocation, int numberOfRooms,
                   String studentName, String regdNo, String electiveSubject, double avgMarks) {
        super(hostelName, hostelLocation, numberOfRooms);
        this.studentName = studentName;
        this.regdNo = regdNo;
        this.electiveSubject = electiveSubject;
        this.avgMarks = avgMarks;
    }

    // Method to print student data
    public void printData() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Registration Number: " + regdNo);
        System.out.println("Elective Subject: " + electiveSubject);
        System.out.println("Average Marks: " + avgMarks);
        printAttributes(); // Invoke the printAttributes method from the Hostel class
    }

    // Implementing abstract method from Department interface
    @Override
    public void printAttributes() {
        System.out.println("Department: Computer Science"); // Assuming a common department for all students
    }
}

// Driver class
public class HostelManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Student> studentMap = new HashMap<>();

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Admit new students");
            System.out.println("2. Migrate a student");
            System.out.println("3. Display details of a student");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    admitNewStudent(scanner, studentMap);
                    break;

                case 2:
                    migrateStudent(scanner, studentMap);
                    break;

                case 3:
                    displayStudentDetails(scanner, studentMap);
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 4);

        scanner.close();
    }

    private static void admitNewStudent(Scanner scanner, Map<String, Student> studentMap) {
        System.out.print("Enter student name: ");
        String studentName = scanner.next();
        System.out.print("Enter registration number: ");
        String regdNo = scanner.next();
        System.out.print("Enter elective subject: ");
        String electiveSubject = scanner.next();
        System.out.print("Enter average marks: ");
        double avgMarks = scanner.nextDouble();

        System.out.print("Enter hostel name: ");
        String hostelName = scanner.next();
        System.out.print("Enter hostel location: ");
        String hostelLocation = scanner.next();
        System.out.print("Enter number of rooms in the hostel: ");
        int numberOfRooms = scanner.nextInt();

        Student student = new Student(hostelName, hostelLocation, numberOfRooms,
                studentName, regdNo, electiveSubject, avgMarks);
        studentMap.put(regdNo, student);
        System.out.println("Student admitted successfully.");
    }

    private static void migrateStudent(Scanner scanner, Map<String, Student> studentMap) {
        System.out.print("Enter registration number of the student to migrate: ");
        String regdNo = scanner.next();
        if (studentMap.containsKey(regdNo)) {
            Student student = studentMap.get(regdNo);

            System.out.print("Enter new hostel name: ");
            String newHostelName = scanner.next();
            System.out.print("Enter new hostel location: ");
            String newHostelLocation = scanner.next();
            System.out.print("Enter new number of rooms in the hostel: ");
            int newNumberOfRooms = scanner.nextInt();

            // Migrate the student to the new hostel
            student.hostelName = newHostelName;
            student.hostelLocation = newHostelLocation;
            student.numberOfRooms = newNumberOfRooms;

            System.out.println("Student migrated successfully.");
        } else {
            System.out.println("Student not found with registration number: " + regdNo);
        }
    }

    private static void displayStudentDetails(Scanner scanner, Map<String, Student> studentMap) {
        System.out.print("Enter registration number of the student: ");
        String regdNo = scanner.next();
        if (studentMap.containsKey(regdNo)) {
            Student student = studentMap.get(regdNo);
            student.printData();
        } else {
            System.out.println("Student not found with registration number: " + regdNo);
        }
    }
}
