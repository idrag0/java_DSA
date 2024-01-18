import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class par17 {
    
}
public class FileReadWriteExample {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try {
            // Read from file
            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            String line;
            StringBuilder content = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            reader.close();

            // Write to file
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            writer.write(content.toString());
            writer.close();

            System.out.println("File read and write operations completed successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
