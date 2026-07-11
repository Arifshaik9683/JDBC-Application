import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;

public class DisplayEmployee {

    public static void main(String[] args) {

        try {

            // Load JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Connect to Database
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbcdemo",
                "javauser",
                "javapass"
            );

            // Create Statement
            Statement stmt = con.createStatement();

            // Execute SELECT Query
            ResultSet rs = stmt.executeQuery("SELECT * FROM employee");

            // Display Heading
            System.out.println("ID\tName\tSalary");
            System.out.println("-------------------------");

            // Read Records
            while (rs.next()) {
                System.out.println(
                    rs.getInt("id") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getDouble("salary")
                );
            }

            // Close Connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
