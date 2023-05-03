/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package project;
import java.sql.*;

/**
 *
 * @author sakirkhan
 */
public class Connectionprovider {
   

public class MySQLConnection {
    public static Connection getCon() {
        Connection conn = null;
        try {
            // Set the database connection details
            String url = "jdbc:mysql://localhost:3306/lms3";
            String username = "root";
            String password = "";

            // Connect to the database
            conn = DriverManager.getConnection(url, username, password);

            // Display a message to confirm the connection
            System.out.println("Connected to the database!");

        } catch (SQLException e) {
            // Handle any database errors
            System.out.println("Error: " + e.getMessage());
//        } finally {
//            // Close the database connection
//            try {
//                if (conn != null) {
//                    conn.close();
//                }
//            } catch (SQLException e) {
//                System.out.println("Error: " + e.getMessage());
//            }
        }
        return conn;
    }
}
    
}
