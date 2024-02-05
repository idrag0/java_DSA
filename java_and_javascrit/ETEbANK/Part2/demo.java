
package Part2;

class Student {
    private int rollNo;
    private String name;
    private int marks;
    private double attendance;

    // Constructor
    public Student(int rollNo, String name, int marks, double attendance) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.attendance = attendance;
    }

    // Getter methods
    public int getRollNo() {
        return rollNo;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    public double getAttendance() {
        return attendance;
    }

    // Method to increase marks for students with attendance > 90%
    public static Student increaseMarks(Student student) {
        if (student.attendance > 90) {
            // Increase marks by 10 (assuming the maximum marks is 50)
            student.marks = Math.min(student.marks + 10, 50);
        }
        return student;
    }

    // Getters and setters (not shown for brevity)
}

public class demo {
    public static void main(String[] args) {
        // Create instances of Student
        Student student1 = new Student(101, "John", 40, 95);
        Student student2 = new Student(102, "Alice", 45, 88);

        // Increase marks based on attendance
        student1 = Student.increaseMarks(student1);
        student2 = Student.increaseMarks(student2);

        // Display updated information
        displayStudentInfo(student1);
        displayStudentInfo(student2);
    }

    // Display student information
    private static void displayStudentInfo(Student student) {
        System.out.println("Roll No: " + student.getRollNo());
        System.out.println("Name: " + student.getName());
        System.out.println("Marks: " + student.getMarks());
        System.out.println("Attendance: " + student.getAttendance() + "%");
        System.out.println("-------------------------");
    }
}
