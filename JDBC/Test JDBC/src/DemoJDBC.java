import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DemoJDBC {
    public static void main(String[] args) {
        // Database URL
        String url = "jdbc:mysql://localhost:3306/jdbc";

        //Database Credentials
        String username = "Admin";
        String password = "pass@123";

        //Establish the Connection with db
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            System.out.println("Connected to the Database Successfully !");
        } catch (SQLException e) {
            System.err.println("Connection Failed " + e.getMessage());
        }
    }
}