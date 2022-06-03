import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * TestDB
 */
public class TestDB3 {

    public static void main(String[] args) {
        String sqlSelectAllPersons = "INSERT INTO `Cliente` (`id`, `nif`, `nombre`, `apellido`, `email`) VALUES ('3', '123456784', 'Maria', 'Lucena', 'marieta@gmail.com')";
        String connectionUrl = "jdbc:mysql://192.168.204.168:3306/Clientes";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);) {

            ps.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
