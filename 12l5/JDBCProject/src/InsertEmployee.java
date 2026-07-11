import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertEmployee {

    public static void main(String[] args) {

        try {

            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to MySQL Database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbcdemo",
                "javauser",
                "javapass"
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // SQL Query
            String sql = "INSERT INTO employee VALUES (101, 'Arif', 45000)";

            // Execute Query
            int rows = stmt.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Record Inserted Successfully");
            } else {
                System.out.println("Record Not Inserted");
            }

            // Close Connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
