package jdbc_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class DisplayStudent {
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

            // Step 4: Write SELECT Query
            String sql = "SELECT * FROM student";

            // Step 5: Execute Query
            ResultSet rs = stmt.executeQuery(sql);

            // Step 6: Display Records
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");

                System.out.println(id + " " + name + " " + age);
            }

            // Step 7: Close Connection
            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}