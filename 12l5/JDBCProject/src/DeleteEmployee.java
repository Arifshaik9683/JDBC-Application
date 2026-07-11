import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteEmployee {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbcdemo",
                "javauser",
                "javapass"
            );

            Statement stmt = con.createStatement();

            String sql = "DELETE FROM employee WHERE id = 101";

            int rows = stmt.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Record Deleted Successfully");
            } else {
                System.out.println("No Record Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
