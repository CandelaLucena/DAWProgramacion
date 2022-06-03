import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * TestDB
 */
public class TestDB {

    public static void main(String[] args) {
        String sqlSelectAllPersons = "SELECT count(*) FROM Cliente";
        String connectionUrl = "jdbc:mysql://192.168.204.168:3306/Clientes";

        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e1) {
            // TODO Auto-generated catch block
            e1.printStackTrace();
        }

        try (Connection conn = DriverManager.getConnection(connectionUrl, "phpmyadmin", "phpmyadmin");
                PreparedStatement ps = conn.prepareStatement(sqlSelectAllPersons);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                long id = rs.getLong("id");
                String name = rs.getString("nombre");
                String lastName = rs.getString("apellido");

                // do something with the extracted data...
                System.out.println(id+" "+name+" "+lastName);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}