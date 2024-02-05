package Part2;
import java.util.ArrayList;
import java.util.List;
public class q4 {
    public static void main(String[] args) {
        // Create a list to store student data
        List<Student> students = new ArrayList<>();

        // Add student data to the list
        students.add(new Student("John Doe", "1234567890", 85, 'M'));
        students.add(new Student("Jane Smith", "9876543210", 92, 'F'));
        // Add more students...

        // Print the student data
        for (Student student : students) {
            System.out.println("Name: " + student.getName());
            System.out.println("Mobile No.: " + student.getMobileNo());
            System.out.println("Marks: " + student.getMarks());
            System.out.println("Gender: " + student.getGender());
            System.out.println();
        }
    }
}

class Student {
    private String name;
    private String mobileNo;
    private int marks;
    private char gender;

    public Student(String name, String mobileNo, int marks, char gender) {
        this.name = name;
        this.mobileNo = mobileNo;
        this.marks = marks;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public int getMarks() {
        return marks;
    }

    public char getGender() {
        return gender;
    }
}
