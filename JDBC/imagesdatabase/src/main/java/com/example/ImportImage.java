package com.example;

import java.sql.Statement;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// schema of the database --> id,image,time

public class ImportImage {
    public static void main(String[] args) throws ClassNotFoundException {
        String url = "jdbc:mysql://localhost:3306/images_db";
        String username = "root";
        String password = "pass@123";
        String query = "SELECT image FROM image_repo WHERE id=?;";
        String write_path = "D:\\Java Source Files\\JDBC\\imagesdatabase\\img\\";

        // It becomes important to concatenate the file path with the name of the file we want to use for fetched image;
        String file_name="extractedImg.png";

        try {
            // Loading the class Dynamically
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Connection established Successfully !");

            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement ps = con.prepareStatement(query);
            ps.setInt(1, 1);
            ResultSet rs =ps.executeQuery();
            // Reading the binary file from the database and storing it into a byte array 
            byte[] image = null;
            while(rs.next()){
                  image =rs.getBytes("image");
            }
            
            // Creating an outputStream so that the file can be converted to it's original formal and giving the path where we 
            // want to store our filel 

            OutputStream os=new FileOutputStream(write_path+file_name);
            if (image != null) {
                os.write(image);
            } else {
                System.out.println("No image found for the given ID.");
            }

            // Closing the instances 
            ps.close();
            con.close();
            os.close();

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}