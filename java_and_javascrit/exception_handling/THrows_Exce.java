package exception_handling;
import java.io.IOException;
import java.sql.SQLException;

public class THrows_Exce {
    public void doSomething() throws IOException, SQLException {
        // Code that may throw IOException or SQLException
        throw new IOException("An IO exception occurred");
    }

    public static void main(String[] args) {
        THrows_Exce obj = new THrows_Exce();
        try {
            obj.doSomething();
        } catch (IOException e) {
            // Handle IOException
            System.out.println("Caught IOException: " + e.getMessage());
        } catch (SQLException e) {
            // Handle SQLException
            System.out.println("Caught SQLException: " + e.getMessage());
        }
    }
}
