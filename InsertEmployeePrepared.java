import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertEmployeePrepared {

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

            // Create PreparedStatement
            String sql = "INSERT INTO employee (id, name, salary) VALUES (?, ?, ?)";

            PreparedStatement ps = con.prepareStatement(sql);

            // Set values
            ps.setInt(1, 102);
            ps.setString(2, "Rahul");
            ps.setDouble(3, 55000);

            // Execute query
            int rows = ps.executeUpdate();

            if (rows > 0) {
                System.out.println("Record Inserted Successfully");
            } else {
                System.out.println("Record Not Inserted");
            }

            // Close resources
            ps.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
