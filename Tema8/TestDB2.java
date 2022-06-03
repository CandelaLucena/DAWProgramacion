import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * TestDB
 */
public class TestDB2 {

    public static void main(String[] args) {
        String sqlSelectAllPersons = "SELECT * FROM Cliente";
        String connectionUrl = "jdbc:mysql://192.168.204.168:3306/Clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String nif = rs.getString("nif");
                String name = rs.getString("nombre");
                String lastName = rs.getString("apellido");
                String email = rs.getString("email");

                // do something with the extracted data...
                System.out.println(id+" "+nif+" "+name+" "+lastName+" "+email);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
