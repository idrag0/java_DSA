package Part2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC39 {
    public static void main(String[] args) {
        String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(jdbcUrl, username, password)) {
            String insertStudentSQL = "INSERT INTO students (id, name, marks) VALUES (?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(insertStudentSQL)) {
                // Set student data to be inserted
                preparedStatement.setInt(1, 34);
                preparedStatement.setString(2, "New Student");
                preparedStatement.setInt(3, 90);

                // Execute the insert
                int affectedRows = preparedStatement.executeUpdate();
                System.out.println("Rows affected: " + affectedRows);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
