import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * TestDB
 */
public class TestDB2 {

    public static void main(String[] args) {
        String nif= "";
        String nombre="";
        String apellido="";
        String email="";
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca nif:");
        nif = lector.nextLine();
        System.out.println("Introduzca nombre");
        nombre = lector.nextLine();
        System.out.println("Introduzca apellido:");
        apellido = lector.nextLine();
        System.out.println("Introduzca email:");
        email = lector.nextLine();
        lector.close();
        String sqlSelectAllPersons = "INSERT INTO `Cliente` (`id`, `nif`, `nombre`, `apellido`, `email`) VALUES (null, '"+nif+"', '"+nombre+"', '"+apellido+"', '"+email+"')";
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