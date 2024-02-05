package Part2;
import java.io.*;
class Student implements Serializable {
    private String name;
    private String subject;
    private String university;
    private String gender;

    public Student(String name, String subject, String university, String gender) {
        this.name = name;
        this.subject = subject;
        this.university = university;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public String getUniversity() {
        return university;
    }

    public String getGender() {
        return gender;
    }
}

public class serializble40 {
    public static void main(String[] args) {
        // Create a student object
        Student student = new Student("John Doe", "Computer Science", "ABC University", "Male");

        // Serialize the student object and store it in a file
        try {
            FileOutputStream fileOut = new FileOutputStream("./student.ser");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(student);
            out.close();
            fileOut.close();
            System.out.println("Student object serialized and stored in student.ser");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize the student object from the file
        try {
            FileInputStream fileIn = new FileInputStream("student.ser");
            ObjectInputStream in = new ObjectInputStream(fileIn);
            Student deserializedStudent = (Student) in.readObject();
            in.close();
            fileIn.close();

            // Fetch the stored data
            String name = deserializedStudent.getName();
            String subject = deserializedStudent.getSubject();
            String university = deserializedStudent.getUniversity();
            String gender = deserializedStudent.getGender();

            System.out.println("Name: " + name);
            System.out.println("Subject: " + subject);
            System.out.println("University: " + university);
            System.out.println("Gender: " + gender);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}