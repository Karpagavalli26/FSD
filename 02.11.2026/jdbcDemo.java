package jdbc_operation;

import java.sql.*;

public class jdbcDemo {

    public static void main(String[] args) {

        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/FacePrep",
                "root",
                "Divya@2006"
            );

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Print
            System.out.println("123");

            // Step 5: Execute Query
            stmt.executeUpdate(
                "CREATE TABLE emp (" +
                "id INT PRIMARY KEY, " +
                "name VARCHAR(50), " +
                "age INT)"
            );

            System.out.println("456");
            System.out.println("Table created successfully!");

            // Step 6: Close
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}