package org.example;

import java.sql.*;
import java.util.Scanner;

public class PrecompiledStatments {
    // The standard statements in the java jdbc are prone to sql injecttion
    // and are less sequred as the data can be leaked ==> performance issues

    // instead we can use the prepared statements which are used in order to make
    // precompiled statements which with the help of placeholders can be executed
    // later on ...


    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String pass = "pass@123";

        //loading the drivers
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connect = DriverManager.getConnection(url, username, pass);

        String query = "SELECT * FROM employee WHERE empno=?;";

        // Here we can compile an sql query
        PreparedStatement st = connect.prepareStatement(query);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the index you want to retreive : ");
        int index = sc.nextInt();
        st.setInt(1, index);

        //Executing the given query
        // note that while using the Prepared Statements we should not pass the sql query
        // again to our executeQuery() method as it has been already precompiled and stored
        ResultSet rs = st.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getInt("empno"));
            System.out.println(rs.getString("ename"));
            System.out.println(rs.getInt("deptno"));
            System.out.println(rs.getString("job"));
            System.out.println(rs.getDate("hiredate"));

        }



    }


}
