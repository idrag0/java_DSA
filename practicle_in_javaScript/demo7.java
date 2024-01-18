package student;

public class Student {
    public String name; // Public specifier
    protected int rollNo; // Protected specifier
    int age; // Default specifier
    private float marks; // Private specifier

    // Constructor
    public Student(String name, int rollNo, int age, float marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
        this.marks = marks;
    }

    // Private method to calculate grade
    private char calculateGrade() {
        if(marks >= 90) {
            return 'A';
        } else if(marks >= 80) {
            return 'B';
        } else if(marks >= 70) {
            return 'C';
        } else if(marks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }

    // Public method to print the mark sheet
    public void printMarkSheet() {
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Age: " + age);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Create a Student object
        Student student = new Student("John Doe", 1, 20, 85.5f);

        // Print the mark sheet
        student.printMarkSheet();
    }
}