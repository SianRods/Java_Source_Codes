package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String pass = "pass@123";

        //loading the drivers
        Class.forName("com.mysql.cj.jdbc.Driver");

        // connection class is an interface and it is implemented using DriverManager
        Connection connect = DriverManager.getConnection(url, username, pass);
        System.out.println("Conneciton Established Successfully :)");


        String query = "SELECT * FROM employee;";

        Statement st = connect.createStatement();
        ResultSet rs = st.executeQuery(query);

        System.out.println("Query Executed Successfully :) ;");

        // In place of column index we can also specify the integer value of the col index
        // starting from 1
        while (rs.next()) {
            System.out.println(rs.getInt("empno"));
            System.out.println(rs.getString("ename"));
            System.out.println(rs.getInt("deptno"));
            System.out.println(rs.getString("job"));
            System.out.println(rs.getDate("hiredate"));

        }
    }
}
