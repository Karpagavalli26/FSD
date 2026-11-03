package jdbc_operation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateStudent {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "Divya@2006"
            );

            Statement stmt = con.createStatement();

            String sql = "UPDATE student SET age = 25 WHERE id = 1";

            int result = stmt.executeUpdate(sql);

            System.out.println(result + " record updated successfully!");

            stmt.close();
            con.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}