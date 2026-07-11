import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

    public static void main(String[] args) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/jdbcdemo",
                "javauser",
                "javapass"
            );

            Statement stmt = con.createStatement();

            String sql = "CREATE TABLE employee ("
                       + "id INT PRIMARY KEY,"
                       + "name VARCHAR(50),"
                       + "salary DOUBLE)";

            stmt.executeUpdate(sql);

            System.out.println("Table Created Successfully");

            con.close();

        } catch(Exception e) {

            e.printStackTrace();

        }
    }
}
