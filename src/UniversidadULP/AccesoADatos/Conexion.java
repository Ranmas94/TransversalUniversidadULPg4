
package UniversidadULP.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Stefani Escobar
 */
public class Conexion {
    private static final String URL="jdbc:mysql://localhost/";
    private static final String DB="gp4gestionulp.sql";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection connection;
    
    private Conexion() {}
    
    public static Connection getConexion() {
    if (connection == null) {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mariadb://localhost:3306/gp4gestionulp","root","" );
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al conectarse a la BD " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Error al cargar los Drivers " + ex.getMessage());
        }
    }
    return connection;
}
    // Método principal (main)
    public static void main(String[] args) {
        // Intentamos establecer la conexión
        Connection con = getConexion();
        if (con != null) {
            System.out.println("Conexión exitosa!");
        } else {
            System.out.println("Fallo en la conexión.");
        }
    }
}
