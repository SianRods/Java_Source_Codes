
import java.sql.*;

public class DeletionJDBC {
    public static void main(String args[]) throws ClassNotFoundException {
        // In this  File we will try to establish connection with database and read some files using queries
        String url = "jdbc:mysql://localhost:3306/college";
        String username = "root";
        String password = "rodrigos@250";
        String insertQuery = "DELETE FROM student WHERE id=1;";
        try {
            Class.forName("com.sql.jdbc.Driver");
            // Trying to load the driver class at the RunTime
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        // After loading the driver class trying to establish the connection with the Database
        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            Statement stat = connect.createStatement();
            int rowsAffected = stat.executeUpdate(insertQuery);
            if (rowsAffected > 0) {
                System.out.println("Data has been Deleted successfully !." + rowsAffected + "row(s) affected");
            } else {
                System.out.println("Deletion Failed !");
            }

            // Closing all the variables
            stat.close();
            connect.close();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
