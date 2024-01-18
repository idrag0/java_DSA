import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class par15 {
    
}
public class FileReaderExample {
    public static void main(String[] args) {
        String filePath = "/c:/Users/abrar/OneDrive/Desktop/Java_Programing/practicle/par15.java";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
