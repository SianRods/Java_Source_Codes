package com.example;

import java.sql.Statement;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// schema of the database --> id,image,time

public class ImagesDatabase {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/images_db";
        String username = "root";
        String password = "pass@123";
        String query = "INSERT INTO image_repo(image) VALUES (?)";
        String file_path = "img\\hero_chara_mario_update_pc.png";

        try {
            // Loading the class Dynamically
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection established Successfully !");

            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(query);

            // Reads the file from the specified path
            FileInputStream fis = new FileInputStream(file_path);

            //Creating an byte of required size to read the image input 
            byte[] image = new byte[fis.available()];

            // Now reading the binary input using the FileInputStream.read(array_to_be_read_in)

            fis.read(image);
            ps.setBytes(1, image);
            int affectedRows=ps.executeUpdate();

            if(affectedRows>0){
                System.out.println("Image Inserted Successfully :)  !");
            }else{
                System.out.println("Sorry image insertion failed :( !");
            }

            // Closing the instances 
            ps.close();
            con.close();
            fis.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}