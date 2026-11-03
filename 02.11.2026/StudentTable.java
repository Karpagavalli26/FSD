package jdbc_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class StudentTable {
    public static void main(String[] args) {

        try {
            // Step 1: Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Step 2: Establish Connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "Divya@2006"
            );

            // Step 3: Create Statement
            Statement stmt = con.createStatement();

            // Step 4: Create SQL Query
            String sql = "CREATE TABLE IF NOT EXISTS student (" +
                         "id INT PRIMARY KEY, " +
                         "name VARCHAR(50), " +
                         "age INT)";

            // Step 5: Execute Query
            stmt.executeUpdate(sql);

            System.out.println("Table created successfully!");

            // Step 6: Close Connection
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}