import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEmployee {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbcdemo",
                "javauser",
                "javapass"
            );

            Statement stmt = con.createStatement();

            String sql = "UPDATE employee SET salary = 60000 WHERE id = 101";

            int rows = stmt.executeUpdate(sql);

            if (rows > 0) {
                System.out.println("Record Updated Successfully");
            } else {
                System.out.println("No Record Found");
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
