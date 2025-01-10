package com.example;

import java.sql.Statement;

import javax.print.DocFlavor.STRING;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class preparedStatement {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/reservation";
        String username = "root";
        String password = "pass@123";
        String query = "SELECT room_no FROM info WHERE id=(?);";

        try {
            // Loading the driver dynamically during RUNTIME
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Drivers Loaded Successfully !");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            // Establishing connection with the database
            Connection connect = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = connect.prepareStatement(query);
            // Setting the appropraite values for the place holder
            ps.setInt(1, 5);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("guest_name");
                int room = rs.getInt("room_no");
                int con = rs.getInt("contact");
                String time = rs.getTime("date").toString();
                System.out.println("+----------------------------------------------------------------+");
                System.out.println(id);
                System.out.println(name);
                System.out.println(room);
                System.out.println(con);
                System.out.println(time);
                System.out.println("+----------------------------------------------------------------+");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}