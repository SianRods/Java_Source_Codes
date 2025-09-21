package org.example;

import java.sql.*;

public class CRUD {

    public static void main(String[] args) throws  ClassNotFoundException, SQLException {
        // the .execute query can be used for CRUD operations
        // however it may return a boolean value which depends on specific conditions (update/insert/delete)

        String url = "jdbc:mysql://localhost:3306/employee";
        String username = "root";
        String pass = "pass@123";

        //loading the drivers
        Class.forName("com.mysql.cj.jdbc.Driver");

        // connection class is an interface and it is implemented using DriverManager
        Connection connect = DriverManager.getConnection(url, username, pass);
        System.out.println("Connection Established Successfully :)");

        // Note that all the string values inside of the string queries needs to be embedded within ''
        String insertQ = "INSERT INTO employee VALUES(1013,'Narous',105,'Credit','2024-10-21');";
        String updateQ ="UPDATE employee SET  ename='Reyon' WHERE empno=1012;";
        String deleteQ="Delete FROM employee where ename='Frank';";
        Statement st = connect.createStatement();
        boolean status = st.execute(insertQ);

        System.out.println("The above query has been executed successfully !");
        System.out.println("Query Executed Successfully :) ;");
    }


}
