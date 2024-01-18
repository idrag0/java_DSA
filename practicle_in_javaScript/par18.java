import java.sql.*;

public class DatabaseManager {
    public static void main(String[] args) {
        // JDBC connection parameters
        String url = "jdbc:mysql://localhost:3306/mydatabase";
        String username = "root";
        String password = "password";

        try {
            // Establishing a connection to the database
            Connection connection = DriverManager.getConnection(url, username, password);

            // Creating a statement object
            Statement statement = connection.createStatement();

            // Executing SQL queries
            String createTableQuery = "CREATE TABLE IF NOT EXISTS employees (id INT PRIMARY KEY, name VARCHAR(50))";
            statement.executeUpdate(createTableQuery);

            String insertQuery = "INSERT INTO employees (id, name) VALUES (1, 'John Doe')";
            statement.executeUpdate(insertQuery);

            String selectQuery = "SELECT * FROM employees";
            ResultSet resultSet = statement.executeQuery(selectQuery);

            // Processing the query results
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            // Closing resources
            resultSet.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
    

