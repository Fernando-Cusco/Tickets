package ups.sistemas.ticket.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author fernandocuscomejia
 */
public class Conexion {
    
    private Connection connection = null;
    
    public Connection connect(){
        String url = "jdbc:mysql://localhost:3306/ticket";
        String user = "admin";
        String pass = "admin";
        try {
            connection = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
    
    public void closeConnection(){
        try {
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
