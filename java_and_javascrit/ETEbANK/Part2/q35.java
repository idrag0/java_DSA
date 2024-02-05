package Part2;
import java.sql.*;
public class q35 {
    public static void main(String[] args) {
        try {
            // Establish connection to the database
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mydatabase", "username", "password");

            // Create a statement
            Statement statement = connection.createStatement();

            // Create a table to store student data
            String createTableQuery = "CREATE TABLE IF NOT EXISTS students (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), age INT)";
            statement.executeUpdate(createTableQuery);

            // Insert data into the table
            String insertDataQuery = "INSERT INTO students (name, age) VALUES (?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(insertDataQuery);

            // Insert 10 students' data
            for (int i = 1; i <= 10; i++) {
                preparedStatement.setString(1, "Student " + i);00
                preparedStatement.setInt(2, 20 + i);
                preparedStatement.executeUpdate();
            }

            // Retrieve data using ResultSet
            String retrieveDataQuery = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(retrieveDataQuery);

            // Print the retrieved data
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }

            // Close the resources
            resultSet.close();
            preparedStatement.close();
            statement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
