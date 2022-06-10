import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/**
 * TestDB
 */
public class TestDB5 {

    public static void main(String[] args) {
        String nif= "";
        String nombre="";
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca nif:");
        nif = lector.nextLine();
        System.out.println("Introduzca nombre");
        nombre = lector.nextLine();
        lector.close();

        String sqlSelectAllPersons = "update Cliente set nombre = '"+nombre+"' where nif = '"+nif+"'";
        String connectionUrl = "jdbc:mysql://192.168.204.145:3306/Clientes";

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