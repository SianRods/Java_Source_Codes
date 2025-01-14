
import java.sql.*;

public class ConnectJDBC {
    public static void main(String args[]) throws ClassNotFoundException {
        // In this  File we will try to establish connection with database and read some files using queries
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String password = "pass@123";
        String query = " select * from employee;";
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
            ResultSet rs = stat.executeQuery(query);

            //Using Loop
            while (rs.next()) {
                int empno = rs.getInt("empno");
                String eName = rs.getString("ename");
                int dept_no = rs.getInt("deptno");
                String job_title = rs.getString("job");
                String hiredate = rs.getString("hiredate");
                System.out.println();
                System.out.println("++++++++++++++++++");
                System.out.println("Employee No: " + empno);
                System.out.println("Employee Name: " + eName);
                System.out.println("Department Number: " + dept_no);
                System.out.println("Job Title: " + job_title);
                System.out.println("Hire Date: " + hiredate);

            }

            // Closing all the variables
            
            rs.close();
            stat.close();
            connect.close();


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

    }
}
