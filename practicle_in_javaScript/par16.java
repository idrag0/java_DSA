import java.io.FileWriter;
import java.io.IOException;
public class par16 {
public class FileWriteExample {
    public static void main(String[] args) {
        String filePath = "/path/to/your/file.txt";
        String content = "Hello, World!";

        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(content);
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
            e.printStackTrace();
        }
    }
}
    
}
